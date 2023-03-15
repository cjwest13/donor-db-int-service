package com.cjwest13.donor.integration.actblue

import com.cjwest13.donor.integration.model.ActBlueCreateCVSResponse
import com.cjwest13.donor.integration.model.ActBlueDonation
import com.cjwest13.donor.integration.model.ActBlueGetCVSResponse
import com.cjwest13.donor.integration.utils.DonorIntegrationServiceUtils
import com.cjwest13.donor.integration.utils.DonorIntegrationServiceUtils.downloadFileFromUrl
import com.cjwest13.donor.integration.utils.DonorIntegrationServiceUtils.getCSVAsObject
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import org.springframework.web.util.UriBuilder
import reactor.core.publisher.Mono
import java.io.File
import java.nio.file.Paths
import java.util.*

@Service("ActBlueAPI")
class AptBlueAPIImpl(private val client : WebClient,
                     @Value("\${actblue.cvs.path}") private val cvsPath : String,
                     @Value("\${stage.dir}") private val stageDir : String)  : ActBlueAPI {

    override fun createActBlueCSV(dateStart: Date, dateEnd: Date, cvsType: String): Mono<ActBlueCreateCVSResponse> {

        return client.post()
            .uri {
                builder : UriBuilder -> builder.path(cvsPath).build()
            }
            .body(BodyInserters.fromValue(DonorIntegrationServiceUtils.createActBlueRequestBody(dateStart, dateEnd, cvsType)))
            .retrieve()
            .bodyToMono<ActBlueCreateCVSResponse>()
            .log()
    }

    override fun getActBlueCSV(actBlueCreateCVSResponse: ActBlueCreateCVSResponse): Mono<ActBlueGetCVSResponse> {

        return client.get()
            .uri {
                    builder : UriBuilder -> builder.path(cvsPath).pathSegment(actBlueCreateCVSResponse.id).build()
            }
            .retrieve()
            .bodyToMono<ActBlueGetCVSResponse>()
            .log()
    }

    @Suppress("UNCHECKED_CAST")
    override fun getActBlueDonations(downloadUrl: String): List<ActBlueDonation> {
        val filePath = Paths.get(stageDir + File.separator + UUID.randomUUID()).normalize()
        downloadFileFromUrl(filePath, downloadUrl)
        return getCSVAsObject(filePath.toString(), ActBlueDonation::class.java) as List<ActBlueDonation>
    }

}
package com.cjwest13.donor.integration.actblue

import com.cjwest13.donor.integration.DonorIntegrationServiceConstants
import com.cjwest13.donor.integration.DonorIntegrationServiceConstants.CVS_SECRET
import com.cjwest13.donor.integration.DonorIntegrationServiceConstants.CVS_UUID
import com.cjwest13.donor.integration.DonorIntegrationServiceConstants.JUNIT_PROFILE
import com.cjwest13.donor.integration.DonorIntegrationServiceConstants.NOT_JUNIT_PROFILE
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.env.Environment
import org.springframework.core.env.Profiles
import org.springframework.http.HttpHeaders
import org.springframework.web.reactive.function.client.WebClient
import java.util.*

@Configuration
class ActBlueWebConfig( @Value("\${actblue.url}") val baseUrl : String) {

    @Autowired
    lateinit var env : Environment

    @Bean
    fun createWebClient(): WebClient {
        return WebClient.builder()
            .baseUrl(baseUrl)
            .defaultHeaders { httpHeaders -> httpHeaders.addAll(createActBlueHttpHeaders()) }
            .build()
    }

    fun createActBlueHttpHeaders(): HttpHeaders {
        return if (env.acceptsProfiles(Profiles.of(NOT_JUNIT_PROFILE))) {
            object : HttpHeaders() {
                init {
                    val authStr = "$CVS_UUID:$CVS_SECRET"
                    val base64Creds = Base64.getEncoder().encode(authStr.toByteArray())
                    val authHeader = "Basic " + String(base64Creds)
                    set("Authorization", authHeader)
                }
            }
        } else {
            HttpHeaders()
        }
    }

}
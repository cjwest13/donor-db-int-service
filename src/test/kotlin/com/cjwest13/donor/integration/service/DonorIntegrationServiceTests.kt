package com.cjwest13.donor.integration.service

import com.cjwest13.donor.integration.DonorIntegrationServiceApplicationTests
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class DonorIntegrationServiceTests : DonorIntegrationServiceApplicationTests() {
    @Mock
    var actBlue: ActBlueAPIImpl? = null

    @InjectMocks
    @Autowired
    var service: DonorIntegrationServiceImpl? = null
    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    @Throws(Exception::class)
    fun testActBlueToBloom() {
        val pattern = "yyyy-MM-dd"
        val dateStart = "2022-03-01"
        val dateEnd = "2022-04-01"
        val simpleDateFormat = SimpleDateFormat(pattern)
        val startDate: Date = simpleDateFormat.parse(dateStart)
        val endDate: Date = simpleDateFormat.parse(dateEnd)
        val cvsType = "paid_contributions"
        val actBlueCreateCvs = ActBlueCreateCVSResponse()
        actBlueCreateCvs.id = "asdhuas-sasadsaj"
        val actBlueGetCvs = ActBlueGetCVSResponse()
        actBlueGetCvs.status = "complete"
        Mockito.`when`<Mono<ActBlueCreateCVSResponse>>(
            actBlue.createActBlueCSV(
                ArgumentMatchers.any<Date>(),
                ArgumentMatchers.any<Date>(),
                ArgumentMatchers.anyString()
            )
        ).thenReturn(actBlueCreateCvs)
        Mockito.`when`<Mono<ActBlueGetCVSResponse>>(actBlue.getActBlueCSV(actBlueCreateCvs)).thenReturn(actBlueGetCvs)
        val response: List<DonationReport> = service!!.actBlueToBloom(startDate, endDate, cvsType)
        Assertions.assertNotNull(response)
        //        assertEquals(, response, "Service Response");
    }
}
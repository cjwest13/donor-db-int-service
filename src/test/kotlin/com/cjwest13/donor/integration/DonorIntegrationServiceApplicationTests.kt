package com.cjwest13.donor.integration

import com.cjwest13.donor.integration.DonorIntegrationServiceConstants.JUNIT_PROFILE
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

@SpringBootTest
@ActiveProfiles(JUNIT_PROFILE)
class DonorIntServiceApplicationTests {

    @Test
    fun contextLoads() {
    }

}

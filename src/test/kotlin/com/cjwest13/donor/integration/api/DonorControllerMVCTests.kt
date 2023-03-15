package com.cjwest13.donor.integration.api

import com.cjwest13.donor.integration.domain.DonationReport
import org.junit.jupiter.api.Test
import java.util.*

class DonorControllerMVCTests {
    private var mockMvc: MockMvc? = null

    @Mock
    private val donorIntegrationService: DonorIntegrationServiceImpl? = null

    @InjectMocks
    @Autowired
    private val donorController: DonorController? = null
    @BeforeEach
    @Throws(Exception::class)
    fun init() {
        MockitoAnnotations.openMocks(this)
        val lists: List<DonationReport> = ArrayList<DonationReport>()
        Mockito.`when`<List<DonationReport>>(
            donorIntegrationService.actBlueToBloom(
                ArgumentMatchers.any<Date>(),
                ArgumentMatchers.any<Date>(),
                ArgumentMatchers.any<String>()
            )
        )
            .thenReturn(lists)
        mockMvc = MockMvcBuilders.standaloneSetup(donorController).build()
    }

    @Test
    @Throws(Exception::class)
    fun testActBlueToBloomerang() {
        mockMvc.perform(MockMvcRequestBuilders.get("/donor/actBlueToBloom?dateStart=2022-02-01&dateEnd=2022-03-01&cvsType=paid_contributions"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().isOk())
    }

    @Test
    @Throws(Exception::class)
    fun testActBlueToBloomerangBadStartDate() {
        mockMvc.perform(MockMvcRequestBuilders.get("/donor/actBlueToBloom?dateStart=2202-01&dateEnd=2022-03-01&cvsType=paid_contributions"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().isBadRequest())
    }

    @Test
    @Throws(Exception::class)
    fun testActBlueToBloomerangBadEndDate() {
        mockMvc.perform(MockMvcRequestBuilders.get("/donor/actBlueToBloom?dateStart=2022-02-01&dateEnd=2022-99-01&cvsType=paid_contributions"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().isBadRequest())
    }

    @Test
    @Throws(Exception::class)
    fun testActBlueToBloomerangNoCvsType() {
        mockMvc.perform(MockMvcRequestBuilders.get("/donor/actBlueToBloom?dateStart=2022-02-01&dateEnd=2022-03-01"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.status().isBadRequest())
    }
}
package com.kandc.practice

import com.kandc.practice.controller.PracticeController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class PracticeControllerTest {

    @Autowired
    lateinit var practiceController: PracticeController

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should get a 200 from ping`(){

        assertThat(mockMvc.get("/ping")
            .andDo { print() }
            .andReturn().response.status)
            .isEqualTo(200)

    }


}
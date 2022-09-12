package com.kandc.practice

import com.kandc.practice.controller.PracticeController
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest
@AutoConfigureMockMvc
class PracticeControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `ping gets 200 and LIVE`(){

        mockMvc.get("/ping")
                .andDo { print() }
                .andReturn()
                .response
                .let { response ->
                    assertThat(response.status).isEqualTo(200)
                    assertThat(response.contentAsString).isEqualTo("LIVE")
                }
    }
}
package io.goooler.demoservice

import io.goooler.demoservice.web.HelloController
import org.hamcrest.Matchers.equalTo
import org.junit.Before
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders


@SpringBootTest
class DemoApplicationTests {

    private lateinit var mvc: MockMvc

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mvc = MockMvcBuilders.standaloneSetup(HelloController()).build()
    }

    @Test
    @Throws(java.lang.Exception::class)
    fun getHello() {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk)
                .andExpect(content().string(equalTo("Hello World")))
    }
}

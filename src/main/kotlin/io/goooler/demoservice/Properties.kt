package io.goooler.demoservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class Properties {
    @Value("\${io.goooler.demoservice.author}")
    lateinit var author: String

    @Value("\${io.goooler.demoservice.randomString}")
    lateinit var randomString: String

    @Value("\${io.goooler.demoservice.randomLong}")
    lateinit var randomLong: String

    @Value("\${io.goooler.demoservice.randomInt}")
    lateinit var randomInt: String
}
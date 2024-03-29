package io.goooler.demoservice

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest
class TestsTwo {

  @Autowired
  private lateinit var properties: Properties

  @Test
  fun print() {
    println(properties.author)
    println(properties.randomString)
    println(properties.randomLong)
    println(properties.randomInt)
  }
}

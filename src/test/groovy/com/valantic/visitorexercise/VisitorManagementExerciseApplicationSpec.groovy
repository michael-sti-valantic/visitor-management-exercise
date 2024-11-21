package com.valantic.visitorexercise

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class VisitorManagementExerciseApplicationSpec extends Specification {

    @Autowired (required = false)
    private ExampleJava exampleJava

    def "load context"() {
        expect:
        exampleJava
    }
}

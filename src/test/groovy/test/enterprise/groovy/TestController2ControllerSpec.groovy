package test.enterprise.groovy

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TestController2ControllerSpec extends Specification implements ControllerUnitTest<TestController2Controller> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

package test.enterprise.groovy

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SprocketSpec extends Specification implements DomainUnitTest<Sprocket> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}

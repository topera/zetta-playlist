package com.topera.zp.specs

import spock.lang.Specification

class BasicSpec extends Specification {

    def "check if tests are working"() {
        when:
        def a = 1
        def b = 2

        then:
        a + b == 3
    }

}
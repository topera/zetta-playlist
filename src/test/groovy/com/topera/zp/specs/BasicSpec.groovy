package com.topera.zp.specs

import spock.lang.Specification

/**
 * Created by topera on 18/06/17.
 */
class BasicSpec extends Specification {

    def "check if tests are working"() {
        when:
        def a = 1
        def b = 2

        then:
        a + b == 3
    }

}
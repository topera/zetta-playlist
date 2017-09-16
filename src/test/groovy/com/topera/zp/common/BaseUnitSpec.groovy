package com.topera.zp.common

import org.mockito.MockitoAnnotations
import spock.lang.Specification

abstract class BaseUnitSpec extends Specification {

    void setup() {
        MockitoAnnotations.initMocks(this)
    }

}

/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.common

import org.mockito.MockitoAnnotations
import spock.lang.Specification

abstract class BaseUnitSpec extends Specification {

    void setup() {
        MockitoAnnotations.initMocks(this)
    }

}

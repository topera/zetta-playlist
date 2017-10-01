/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.controller

import com.terahorse.zp.BaseIntegrationSpec
import com.terahorse.zp.model.zp.Version
import org.junit.Test

class VersionControllerSpec extends BaseIntegrationSpec {

    @Test
    def "getVersion()"() {
        when: "read version"
        def version = readPage("/api/version", Version)

        then: "receive version"
        version.getName().matches(/v\d+\.\d+\.\d+-\d{6}.\d{6}/)
    }


}

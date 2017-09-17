/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.controller

import com.terahorse.zp.BaseIntegrationSpec
import org.junit.Test

class IndexSpec extends BaseIntegrationSpec {

    @Test
    def "read index"() {
        when: "read page"
        def body = readPage("/")

        then: "page is correct"
        body.contains("<title>Zetta Playlist</title>")
    }

    @Test
    def "read 404"() {
        when: "read page"
        def body = readPage("/404")

        then: "receive error"
        body.contains("Not Found")
    }

}

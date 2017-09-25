/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client

import com.terahorse.zp.BaseUnitSpec
import com.terahorse.zp.exception.ZPNotSupportedException

class MusicClientFactorySpec extends BaseUnitSpec {

    def "create() - deezer"() {
        expect:
        MusicClientFactory.create(MusicClientType.DEEZER).class == DeezerClient
        1 == 2
    }

    def "create() - invalid"() {
        when: "get invalid client"
        MusicClientFactory.create(MusicClientType.SPOTIFY)

        then: "get error"
        thrown(ZPNotSupportedException)
    }

}

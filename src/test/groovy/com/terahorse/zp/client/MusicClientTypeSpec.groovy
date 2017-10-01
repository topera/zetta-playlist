/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client

import com.terahorse.zp.BaseUnitSpec

class MusicClientTypeSpec extends BaseUnitSpec {

    def "convertString() - ok"() {
        expect:
        MusicClientType.convertString("deezer") == MusicClientType.DEEZER
        MusicClientType.convertString("DEEZER") == MusicClientType.DEEZER
        MusicClientType.convertString("spotify") == MusicClientType.SPOTIFY
    }

    def "convertString() - error"() {
        when:
        MusicClientType.convertString("unknown")

        then:
        thrown(IllegalArgumentException)
    }

}

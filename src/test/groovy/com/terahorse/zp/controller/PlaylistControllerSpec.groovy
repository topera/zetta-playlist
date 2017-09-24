/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.controller

import com.terahorse.zp.BaseIntegrationSpec
import com.terahorse.zp.model.zp.Playlists
import org.junit.Test

class PlaylistControllerSpec extends BaseIntegrationSpec {

    @Test
    def "listAll() - deezer"() {
        when: "read page"
        def playlists = readPage("/api/playlist/deezer", Playlists)

        then: "we have 7 playlists"
        playlists.getData().size() == 7
    }

    @Test
    def "listAll() - invalid page"() {
        when: "read invalid page"
        def playlists = readPage("/api/playlist/unknown", Playlists)

        then: "we have 7 playlists"
        playlists.getData().size() == 7 // TODO: DOING
    }

//    @Test
//    def "listOne()"() {
//
//    }

}

/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.converter

import com.terahorse.zp.BaseUnitSpec
import com.terahorse.zp.model.deezer.PlaylistDeezer
import com.terahorse.zp.model.deezer.PlaylistsDeezer

class DeezerConverterSpec extends BaseUnitSpec {

    def deezerConverter = new DeezerConverter()

    def "convertPlaylists() - no list"() {
        given: "a null playlist"
        def playlistsDeezer = new PlaylistsDeezer()

        when: "when try to convert"
        def playlists = deezerConverter.convertPlaylists(playlistsDeezer)

        then: "have 0 playlists"
        playlists.getData().size() == 0
    }

    def "convertPlaylists() - empty list"() {
        given: "an empty playlist"
        def playlistsDeezer = new PlaylistsDeezer()
        playlistsDeezer.setData([])

        when: "when try to convert"
        def playlists = deezerConverter.convertPlaylists(playlistsDeezer)

        then: "have 0 playlists"
        playlists.getData().size() == 0
    }

    def "convertPlaylist()- list with 2 lists"() {
        given: "a playlist with 2 items"
        def playlistsDeezer = new PlaylistsDeezer()
        def data = []
        data << new PlaylistDeezer(title: "listOne")
        data << new PlaylistDeezer(title: "listTwo")
        playlistsDeezer.setData(data)

        when: "when try to convert"
        def playlists = deezerConverter.convertPlaylists(playlistsDeezer)

        then: "have 2 playlists"
        playlists.getData().size() == 2
        playlists.getData()[0].getTitle() == "listOne"
        playlists.getData()[1].getTitle() == "listTwo"
    }

}

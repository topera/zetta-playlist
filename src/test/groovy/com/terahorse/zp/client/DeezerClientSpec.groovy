/*
 * Copyright (c) 2017 - Terahorse
 */

package com.terahorse.zp.client

import com.terahorse.zp.BaseRestTemplateSpec
import com.terahorse.zp.exceptions.ZPRequestError
import com.terahorse.zp.model.deezer.PlaylistDeezer
import com.terahorse.zp.model.deezer.PlaylistsDeezer
import org.mockito.InjectMocks
import org.springframework.http.HttpStatus
import org.springframework.web.client.HttpClientErrorException

import static org.mockito.Mockito.when

class DeezerClientSpec extends BaseRestTemplateSpec {

    private static final String PLAYLISTS_URL = "http://api.deezer.com/chart/0/playlists"
    private static final String PLAYLIST_URL = "http://api.deezer.com/playlist"

    @InjectMocks
    DeezerClient deezerClient

    def "findPlaylists() - simulate 404"() {
        setup: "simulate 404"
        mockFindPlaylists([], new HttpClientErrorException(HttpStatus.NOT_FOUND))

        when: "find all playlists"
        deezerClient.findPlaylists()

        then: "we receive exception"
        thrown(ZPRequestError)
    }

    def "findPlaylists() - 0 results"() {
        when: "deezer returns 0 playlists"
        mockFindPlaylists([])

        then: "we have 0 playlists"
        deezerClient.findPlaylists().getData().size() == 0
    }

    def "findPlaylists() - 1 result"() {
        when: "deezer returns 1 playlist"
        def playlistDeezer = new PlaylistDeezer()
        mockFindPlaylists([playlistDeezer])

        then: "we have 1 playlist"
        deezerClient.findPlaylists().getData().size() == 1
    }

    def "findPlaylist() - not found"() {
        setup: "we mock an invalid id"
        mockFindPlaylist(999, null, new HttpClientErrorException(HttpStatus.NOT_FOUND))

        when: "find the invalid id"
        deezerClient.findPlaylist(999)

        then: "we get error"
        thrown(ZPRequestError)
    }

    def "findPlaylist() - valid id"() {
        when: "we search a valid id"
        def playlistDeezer = new PlaylistDeezer()
        playlistDeezer.setTitle("This is my playlist")
        mockFindPlaylist(10, playlistDeezer)

        then: "we get error"
        deezerClient.findPlaylist(10).getTitle() == "This is my playlist"
    }

    private void mockFindPlaylists(List<PlaylistDeezer> data, HttpClientErrorException exception=null) {
        if (exception) {
            when(restTemplate.getForObject(PLAYLISTS_URL, PlaylistsDeezer)).thenThrow(exception)
        } else {
            def playlistsDeezer = new PlaylistsDeezer()
            playlistsDeezer.setData(data)
            mockRestTemplate(PLAYLISTS_URL, PlaylistsDeezer, playlistsDeezer)
        }
    }

    private void mockFindPlaylist(Long id, PlaylistDeezer playlistDeezer, HttpClientErrorException exception=null) {
        def url = PLAYLIST_URL + "/" + id
        if (exception) {
            when(restTemplate.getForObject(url, PlaylistDeezer)).thenThrow(exception)
        } else {
            mockRestTemplate(url, PlaylistDeezer, playlistDeezer)
        }
    }

}

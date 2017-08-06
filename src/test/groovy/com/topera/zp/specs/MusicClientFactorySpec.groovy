package com.topera.zp.specs

import com.topera.zp.client.DeezerClient
import com.topera.zp.client.MusicClientFactory
import com.topera.zp.client.MusicClientType
import com.topera.zp.client.SpotifyClient
import com.topera.zp.exceptions.ZPNotSupportedException
import spock.lang.Specification

/**
 * Created by rafael on 18/06/17.
 */
class MusicClientFactorySpec extends Specification {

    def "get invalid music client"() {
        when: "get invalid client"
        def client = MusicClientFactory.create(MusicClientType.SPOTIFY)

        then: "the class is correct"
        client.class == SpotifyClient

        when: "try to do an operation"
        client.getPlaylists()

        then: "we get an error"
        thrown ZPNotSupportedException
    }

    def "get valid music client"() {
        when: "get valid client"
        def client = MusicClientFactory.create(MusicClientType.DEEZER)

        then: "the class is correct"
        client.class == DeezerClient

        when: "try to do an operation"
        client.getPlaylists()

        then: "we don't have any error"
        true
    }

}
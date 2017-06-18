package com.zp.specs

import com.zp.client.MusicClient
import com.zp.client.MusicClientFactory
import com.zp.client.SpotifyClient
import com.zp.exceptions.ZPNotSupportedException
import spock.lang.Specification

/**
 * Created by rafael on 18/06/17.
 */
class MusicClientSpec extends Specification {

    def "get invalid music client"() {
        when: "get invalid client"
        def client = MusicClientFactory.create(MusicClient.Type.SPOTIFY)

        then: "the class is correct"
        client.class == SpotifyClient

        when: "try to do a operation"
        client.getPlaylists()

        then: "we get an error"
        thrown ZPNotSupportedException
    }

}
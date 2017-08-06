package com.topera.zp.specs

import com.topera.zp.client.DeezerClient
import com.topera.zp.client.MusicClientFactory
import com.topera.zp.client.MusicClientType
import spock.lang.Specification

/**
 * Created by topera on 18/06/17.
 */
class DeezerClientSpec extends Specification {

    DeezerClient client

    void setup() {
        client = MusicClientFactory.create(MusicClientType.DEEZER) as DeezerClient
    }

    def "read playlists"() {
        when: "try to get playlists"
        def playlists = client.getPlaylists()

        then: "we get 10 playlists"
        playlists.getData().size() == 7
    }

}
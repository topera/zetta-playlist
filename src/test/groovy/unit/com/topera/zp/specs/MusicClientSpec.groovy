package unit.com.topera.zp.specs

import com.topera.zp.client.DeezerClient
import com.topera.zp.client.MusicClientFactory
import com.topera.zp.client.MusicClientType
import com.topera.zp.exceptions.ZPRequestError
import spock.lang.Specification

class MusicClientSpec extends Specification {

    def "send request to wrong url returns error"() {
        when: "send request to wrong place"
        def client = MusicClientFactory.create(MusicClientType.DEEZER) as DeezerClient
        client.sendRequest("https://www.deezer.com/wrong-url", Object)

        then: "we get error"
        thrown ZPRequestError
    }

}
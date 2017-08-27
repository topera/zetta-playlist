package integration.com.topera.zp.specs

import com.topera.zp.Application
import com.topera.zp.model.zp.Version
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner)
@SpringBootTest(classes=Application, webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class CoreFunctionalSpec extends Specification {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    def "read version"() {
        when: "read version"
        def version = readPage("/api/version", Version)

        then: "receive version"
        version.getName().matches(/\d+\.\d+\.\d+/)
    }

    @Test
    def "read 404"() {
        when: "read page"
        def body = readPage("/404", String)

        then: "receive error"
        body.contains("Not Found")
    }

    @Test
    def "read index"() {
        when: "read page"
        def body = readPage("/", String)

        then: "page is correct"
        body.contains("<title>Zetta Playlist</title>")
    }

    private <T> T readPage(String path, Class<T> clazz) {
        return restTemplate.getForObject("http://localhost:" + port + path, clazz)
    }

}
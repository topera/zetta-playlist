package functional.com.topera.zp.specs

import com.topera.zp.Application
import com.topera.zp.controller.VersionController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import spock.lang.Specification

@RunWith(SpringRunner)
@SpringBootTest(classes=Application)
class FooSpec extends Specification {

    @Autowired
    private VersionController controller;

    @Test
    def "get version"() {
        when:
        def a = 1

        then:
        controller.getVersion()
    }


}
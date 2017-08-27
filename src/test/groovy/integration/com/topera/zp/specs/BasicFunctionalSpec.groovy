package integration.com.topera.zp.specs

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
class BasicFunctionalSpec extends Specification {

    @Autowired
    private VersionController controller;

    private VersionController controllerNotInjected;

    @Test
    def "controller NOT injected"() {
        expect:
        !controllerNotInjected
    }

    @Test
    def "controller injected"() {
        expect:
        controller
    }

}
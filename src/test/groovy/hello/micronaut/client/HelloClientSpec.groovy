package hello.micronaut.client

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification
/**
 * Created by jguo on 2019-05-24.
 */
class HelloClientSpec extends Specification {

    EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    def "test hello world response"() {
        expect:
        def client = embeddedServer
                .applicationContext
                .getBean(HelloClient)
        client.hello().blockingGet() == "Hello World"
    }

}

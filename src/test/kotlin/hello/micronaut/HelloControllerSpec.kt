package hello.micronaut

/**
 * Created by jguo on 2019-05-24.
 */

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals


class HelloControllerSpec {
    lateinit var server: EmbeddedServer
    lateinit var client: HttpClient

    @BeforeTest
    fun setup() {

        server = ApplicationContext.run(EmbeddedServer::class.java)

        client = server
            .getApplicationContext()
            .createBean(HttpClient::class.java, server.url)
    }

    @AfterTest
    fun teardown() {
        client?.close()
        server?.close()
    }

    @Test
    fun testHelloWorldResponse() {
        val rsp: String = client.toBlocking()
            .retrieve("/hello")
        assertEquals("Hello World", rsp)
    }
}
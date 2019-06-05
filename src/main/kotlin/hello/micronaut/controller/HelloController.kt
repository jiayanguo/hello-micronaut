package hello.micronaut.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * Created by jguo on 2019-05-24.
 */

@Controller("/hello")
class HelloController {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun index(): String = "Hello World"
}
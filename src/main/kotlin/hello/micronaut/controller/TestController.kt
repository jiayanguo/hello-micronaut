package hello.micronaut.controller

import hello.micronaut.ioc.ColorPicker
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

/**
 * Created by jguo on 2019-05-29.
 */

@Controller("/test")
class TestController (private val colorPicker: ColorPicker){
    @Get
    fun index():String = colorPicker.color()
}
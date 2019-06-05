package hello.micronaut.ioc

import javax.inject.Singleton


/**
 * Created by jguo on 2019-05-24.
 */

@Singleton
class V8Engine : Engine {
    override var cylinders =8
    override fun start(): String = "Starting V8"
}
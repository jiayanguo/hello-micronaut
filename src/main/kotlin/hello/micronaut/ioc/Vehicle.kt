package hello.micronaut.ioc

import javax.inject.Singleton

/**
 * Created by jguo on 2019-05-24.
 */

@Singleton
class Vehicle(private val engine: Engine) {
    fun start(): String = engine.start()
}
package hello.micronaut.ioc

/**
 * Created by jguo on 2019-05-24.
 */
interface Engine {
    val cylinders:Int
    fun start(): String
}
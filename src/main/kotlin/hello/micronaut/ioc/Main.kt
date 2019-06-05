package hello.micronaut.ioc

import io.micronaut.context.BeanContext


/**
 * Created by jguo on 2019-05-28.
 */

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val vehicle = BeanContext.run().getBean(Vehicle::class.java)

        println(vehicle.start())
    }
}
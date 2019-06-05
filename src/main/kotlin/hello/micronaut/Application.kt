package hello.micronaut

import io.micronaut.runtime.Micronaut

object Application {

//    @JvmStatic
//    fun main(args: Array<String>) {
//        Micronaut.build()
//                .packages("hello.micronaut.controller")
//                .mainClass(Application.javaClass)
//                .start()
//    }

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.run(Application.javaClass)
    }
}
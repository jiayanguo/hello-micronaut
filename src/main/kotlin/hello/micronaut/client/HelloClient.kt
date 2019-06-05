package hello.micronaut.client

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Single

/**
 * Created by jguo on 2019-05-24.
 */

@Client("/hello")
interface HelloClient {
    @Get
    fun hello(): Single<String>
}
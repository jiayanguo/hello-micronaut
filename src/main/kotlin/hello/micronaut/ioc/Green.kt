package hello.micronaut.ioc

import io.micronaut.context.annotation.Primary
import javax.inject.Singleton

/**
 * Created by jguo on 2019-05-29.
 */

@Primary
@Singleton
class Green : ColorPicker {
    override fun color(): String {
        return "green"
    }
}
package hello.micronaut.ioc

import javax.inject.Singleton

/**
 * Created by jguo on 2019-05-29.
 */

@Singleton
class Blue : ColorPicker {
    override fun color(): String {
        return "blue"
    }
}
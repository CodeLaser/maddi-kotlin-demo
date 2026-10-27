package demo.eventual

import io.codelaser.maddi.support.SetOnce

/**
 * Eventually immutable through [SetOnce]: mutable until both values are set, immutable after. Look for: `@Mark` on
 * `init`, `@Only(after=...)` on the getters, and `@Immutable(hc=true, after="host,port")` on the class.
 */
class Config {
    private val host = SetOnce<String>()
    private val port = SetOnce<Int>()

    fun init(h: String, p: Int) {
        host.set(h)
        port.set(p)
    }

    fun host(): String = host.get()

    fun port(): Int = port.get()
}

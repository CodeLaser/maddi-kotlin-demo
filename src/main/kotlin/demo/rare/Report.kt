package demo.rare

import io.codelaser.maddi.annotation.rare.Finalizer

/**
 * A finalizer: after `build()` the object must not be used. Look for: the contracted `@Finalizer` on `build`, and
 * `@Fluent` on `line`.
 */
class Report {
    private val sb = StringBuilder()

    fun line(s: String): Report {
        sb.append(s).append('\n')
        return this
    }

    @Finalizer
    fun build(): String = sb.toString()
}

package demo.method

/**
 * A builder. Look for: `@Fluent` on the functions that return `this`, `@Modified` on them too, and `@NotModified` on
 * `build`.
 */
class Sentence {
    private val sb = StringBuilder()

    fun word(w: String): Sentence {
        if (sb.isNotEmpty()) sb.append(' ')
        sb.append(w)
        return this
    }

    fun period(): Sentence {
        sb.append('.')
        return this
    }

    fun build(): String = sb.toString()
}

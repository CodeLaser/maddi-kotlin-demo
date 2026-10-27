package demo.method

/**
 * A builder. Look for: `@Fluent` on the functions that return `this`, and `@NotModified` on `build`. The fluent
 * functions also modify, and are `@Independent`; both follow (a function modifies by default, and returning `this`
 * is independent), so the hints show them under *Show all*.
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

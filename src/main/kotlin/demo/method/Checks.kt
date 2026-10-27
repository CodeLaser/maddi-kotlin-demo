package demo.method

/**
 * Functions that return their first argument. Look for: `@Identity` on `requireNonNull` and `requirePositive`; not
 * on `orDefault`, which may return its second.
 */
object Checks {
    fun <T : Any> requireNonNull(t: T?, what: String): T {
        requireNotNull(t) { what }
        return t
    }

    fun requirePositive(i: Int): Int {
        require(i > 0) { "not positive: $i" }
        return i
    }

    fun orDefault(s: String?, dflt: String): String = s ?: dflt
}

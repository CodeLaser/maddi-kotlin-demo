package demo.nullability

/**
 * Null in and out, stated by Kotlin's own types: `find` may return null, `describe` accepts null. Look for:
 * `@Nullable` on `find`'s result and `describe`'s parameter, and `@NotNull`, hidden by default, on the rest.
 */
class Lookup(entries: Map<String, String>) {
    private val entries: Map<String, String> = entries.toMap()

    fun find(key: String): String? = entries[key]

    fun name(s: String): Int = s.length

    fun describe(s: String?): String = s ?: "(none)"

    fun findOrEmpty(key: String): String = entries[key] ?: ""
}

package demo.immutable

/**
 * All properties `val`, but one of them is a mutable list that a function changes. Look for: `@Modified` on `tags`
 * and on `tag`. And `@FinalFields` on the class, not
 * `@Immutable`.
 */
class Tags(private val owner: String) {
    private val tags = mutableListOf<String>()

    fun tag(tag: String) {
        tags.add("$owner:$tag")
    }

    fun count(): Int = tags.size
}

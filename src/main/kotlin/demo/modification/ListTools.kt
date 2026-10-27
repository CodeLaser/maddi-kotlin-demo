package demo.modification

/**
 * Functions that change their arguments, and one that only reads. Look for: `@Modified` on the `list` parameters of
 * `sortInPlace` and `addTwice`, `@NotModified` on `first`'s.
 */
object ListTools {
    fun sortInPlace(list: MutableList<String>) {
        list.sort()
    }

    fun addTwice(list: MutableList<String>, s: String) {
        list.add(s)
        list.add(s)
    }

    fun first(list: List<String>): String = list[0]
}

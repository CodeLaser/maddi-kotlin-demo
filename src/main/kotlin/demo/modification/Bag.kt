package demo.modification

/**
 * Mutable, but a container: no method changes the objects it is given. Look for: `@Container` on the class, `add`
 * modifying the bag, `size` and `contains` not.
 */
class Bag {
    private val items = mutableListOf<String>()

    fun add(item: String) {
        items.add(item)
    }

    fun size(): Int = items.size

    fun contains(item: String): Boolean = item in items
}

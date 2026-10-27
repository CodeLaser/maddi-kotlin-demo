package demo.independence

import java.util.Collections

/**
 * Three ways to hand out a property. Look for: `@Dependent` on `exposed()` (the caller can change the inventory
 * through it), `@Independent` on `copy()`, and `@UnmodifiableView` on `view()`.
 */
class Inventory {
    private val items = ArrayList<String>()

    fun add(item: String) {
        items.add(item)
    }

    fun exposed(): MutableList<String> = items

    fun copy(): List<String> = ArrayList(items)

    fun view(): List<String> = Collections.unmodifiableList(items)
}

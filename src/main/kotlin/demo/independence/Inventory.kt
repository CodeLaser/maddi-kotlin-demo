package demo.independence

import java.util.Collections

/**
 * Three ways to hand out a property. Look for: `@Independent` on `copy()`, and `@UnmodifiableView` on `view()`.
 * `exposed()` (the caller can change the inventory through it) is `@Dependent`, the default, which the hints show
 * under *Show all*.
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

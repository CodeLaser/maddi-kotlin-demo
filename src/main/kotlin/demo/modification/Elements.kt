package demo.modification

/**
 * Modifying a collection versus modifying what it holds. Look for: `@Modified(hc=true)` where only the elements
 * change (`touchAll`'s parameter, `touchOwn`), and a plain `@Modified` where the collection itself changes
 * (`addTo`'s parameter, `addOwn`).
 */
class Elements {
    private val items = mutableListOf<Item>()

    fun touchOwn() {
        for (item in items) item.touch()
    }

    fun addOwn(item: Item) {
        items.add(item)
    }

    companion object {
        fun touchAll(list: List<Item>) {
            for (item in list) item.touch()
        }

        fun addTo(list: MutableList<Item>, item: Item) {
            list.add(item)
        }
    }
}

package demo.modification

/** A map-backed registry. Look for: `register` and `clear` modify, `lookup` does not. */
class Registry {
    private val ids = HashMap<String, Int>()

    fun register(name: String, id: Int) {
        ids[name] = id
    }

    fun lookup(name: String): Int? = ids[name]

    fun clear() {
        ids.clear()
    }
}

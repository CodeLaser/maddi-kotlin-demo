package demo.modification

/** A mutable element, used by [Elements]. */
class Item {
    var touched = 0
        private set

    fun touch() {
        touched++
    }
}

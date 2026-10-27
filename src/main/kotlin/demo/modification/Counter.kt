package demo.modification

/** The simplest mutable class. Look for: `inc()` and `reset()` modify, `value()` does not. */
class Counter {
    private var count = 0

    fun inc() {
        count++
    }

    fun reset() {
        count = 0
    }

    fun value(): Int = count
}

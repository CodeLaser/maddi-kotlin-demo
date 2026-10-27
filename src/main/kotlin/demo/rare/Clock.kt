package demo.rare

/** Kotlin's own singleton: an `object`. Look for: whatever the analysis says about a mutable `object`. */
object Clock {
    private var ticks = 0L

    fun tick(): Long = ++ticks
}

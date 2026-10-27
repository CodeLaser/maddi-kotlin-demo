package demo.immutable

/** An enum without state. Look for: `@ImmutableContainer` on the class. */
enum class Color {
    RED, GREEN, BLUE;

    fun next(): Color = entries[(ordinal + 1) % entries.size]
}

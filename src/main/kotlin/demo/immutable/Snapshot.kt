package demo.immutable

/**
 * A copy, but not an immutable one: Kotlin's `toList()` returns a fresh `ArrayList`, and the property's getter hands
 * it out. Look for: an `@Independent` constructor parameter, and `@FinalFields` and `@Dependent` on the class. The
 * Java demo's twin uses `List.copyOf`, which is unmodifiable, and so comes out immutable.
 */
class Snapshot(lines: List<String>) {
    val lines: List<String> = lines.toList()

    fun count(): Int = lines.size
}

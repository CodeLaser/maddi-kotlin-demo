package demo.immutable

import kotlin.math.abs

/** A data class of primitives: as strong as it gets. Look for: `@ImmutableContainer` on the class. */
data class Point(val x: Int, val y: Int) {
    fun translate(dx: Int, dy: Int): Point = Point(x + dx, y + dy)

    fun manhattan(): Int = abs(x) + abs(y)
}

package demo.method

import io.codelaser.maddi.annotation.Commutable
import kotlin.math.abs

/**
 * Contracted commutation: the arguments of `span` may be swapped. `@Commutable` is a contract; the IDE does
 * not show it today.
 */
object Ranges {
    fun span(@Commutable a: Int, @Commutable b: Int): Int = abs(a - b)
}

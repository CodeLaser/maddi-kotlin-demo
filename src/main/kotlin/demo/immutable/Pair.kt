package demo.immutable

/**
 * Immutable, but with hidden content: the analysis cannot see inside `A` and `B`. Look for:
 * `@ImmutableContainer(hc=true)` on the class. The properties' `@Independent(hc=true)` follows from it, so the
 * hints show it under *Show all*.
 */
class Pair<A, B>(val first: A, val second: B) {
    fun swap(): Pair<B, A> = Pair(second, first)
}

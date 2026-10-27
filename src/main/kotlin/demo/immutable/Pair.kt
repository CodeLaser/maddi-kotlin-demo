package demo.immutable

/**
 * Immutable, but with hidden content: the analysis cannot see inside `A` and `B`. Look for:
 * `@ImmutableContainer(hc=true)` on the class and `@Independent(hc=true)` on the properties.
 */
class Pair<A, B>(val first: A, val second: B) {
    fun swap(): Pair<B, A> = Pair(second, first)
}

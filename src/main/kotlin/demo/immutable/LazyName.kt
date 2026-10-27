package demo.immutable

/**
 * A `var` that is only assigned in the constructor. A Kotlin `var` is never `@Final`, by design: say `val` when you
 * mean it. The Java demo's twin, a non-final field, does get `@Final`.
 */
class LazyName(name: String) {
    private var name: String = name
    var reads = 0
        private set

    fun name(): String {
        reads++
        return name
    }
}

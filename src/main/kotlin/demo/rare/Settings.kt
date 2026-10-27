package demo.rare

/** Global state, changed by [SettingsClient]. */
object Settings {
    var level = 0

    fun raise() {
        level++
    }
}

/**
 * Changes another object's state: [Settings] is an `object`, one instance. Look for: `@StaticSideEffects` on
 * `bump`; not on `compute`. `configure` sets the property directly and shows none today, where the Java demo's
 * twin does.
 */
class SettingsClient {
    fun configure() {
        Settings.level = 5
    }

    fun bump() {
        Settings.raise()
    }

    fun compute(x: Int): Int = x * 2
}

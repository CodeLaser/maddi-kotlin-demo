package demo.rare

import io.codelaser.maddi.annotation.rare.IgnoreModifications

/**
 * Logging that should not count as a modification. Look for: the contracted `@IgnoreModifications` on `log`.
 * `twice` is `@NotModified` although it calls `log`; `add` still modifies, because of `total`.
 */
class Audit {
    private val buffer = mutableListOf<String>()
    private var total = 0

    @IgnoreModifications
    fun log(s: String) {
        buffer.add(s)
    }

    fun twice(x: Int): Int {
        log("twice")
        return 2 * x
    }

    fun add(x: Int) {
        log("add")
        total += x
    }
}

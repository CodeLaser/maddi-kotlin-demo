package demo.guard

import io.codelaser.maddi.annotation.Immutable

/**
 * A wrong contract, on purpose: the class claims `@Immutable` but `add` modifies it. Look for: a guard finding,
 * with its why-chain in the maddi tool window.
 */
@Immutable
class WrongImmutable {
    private val items = mutableListOf<String>()

    fun add(s: String) {
        items.add(s)
    }
}

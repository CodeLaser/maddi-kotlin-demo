package demo.guard

import io.codelaser.maddi.annotation.Container

/**
 * A wrong contract, on purpose: a `@Container` must not modify its parameters, and `fill` does. Look for: a guard
 * finding on `fill`'s parameter.
 */
@Container
class WrongContainer {
    fun fill(target: MutableList<String>) {
        target.add("x")
    }
}

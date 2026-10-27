package demo.immutable

import io.codelaser.maddi.annotation.ImmutableContainer

/**
 * A contract on an interface: implementations must be immutable containers. Look for: the contract shown on the
 * interface, and [Circle] verified against it.
 */
@ImmutableContainer
interface Shape {
    fun area(): Double
}

/** Implements [Shape]. Look for: `@ImmutableContainer`, as the interface demands. */
data class Circle(val radius: Double) : Shape {
    override fun area(): Double = Math.PI * radius * radius
}

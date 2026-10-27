package demo.rare

/**
 * Extension functions on [String], compiled into the facade class `StringsKt`: the shape `@ExtensionClass`
 * describes. Look for: `@NotModified` on the functions.
 */
fun String.reversed2(): String = StringBuilder(this).reverse().toString()

fun String.isPalindrome(): Boolean = this == reversed2()

fun String.twice(): String = this + this

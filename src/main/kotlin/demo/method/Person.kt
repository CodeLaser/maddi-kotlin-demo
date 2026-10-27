package demo.method

/**
 * Mutable properties: Kotlin generates the getters and setters. Look for: `@Container` and `@Mutable` on the class.
 * The generated accessors carry no hints of their own, so there is no `@GetSet` as in the Java demo.
 */
class Person(var name: String, var age: Int)

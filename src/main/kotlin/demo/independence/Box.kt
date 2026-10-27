package demo.independence

/**
 * A mutable holder of an object it does not look into. Look for: `@Independent(hc=true)` on the class, the
 * property and the constructor parameter: only hidden content passes.
 */
class Box<T>(var content: T)

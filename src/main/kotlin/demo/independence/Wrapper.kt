package demo.independence

/**
 * Stores the list it is given: the object is linked to the caller's list. Look for: `@Dependent` on the constructor
 * parameter and on `list`, and `@Modified`, because `append` changes that list.
 */
class Wrapper(val list: MutableList<String>) {
    fun append(s: String) {
        list.add(s)
    }
}

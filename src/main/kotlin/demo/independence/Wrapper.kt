package demo.independence

/**
 * Stores the list it is given: the object is linked to the caller's list. Look for: `@Modified` on the constructor
 * parameter, because `append` changes that list. The parameter and `list` are also `@Dependent`, which is the
 * default and so hidden; the hints show it under *Show all*.
 */
class Wrapper(val list: MutableList<String>) {
    fun append(s: String) {
        list.add(s)
    }
}

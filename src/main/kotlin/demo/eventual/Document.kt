package demo.eventual

import io.codelaser.maddi.support.EventuallyFinalOnDemand

/**
 * Editable until committed. Look for: `@Only(before=...)` on `edit`, `@Mark` on `commit`, `@TestMark` on
 * `isCommitted`, and `@NotModified(after="text")` on `length`.
 */
class Document {
    private val text = EventuallyFinalOnDemand<String>()

    fun edit(s: String) {
        text.setVariable(s)
    }

    fun commit(s: String) {
        text.setFinal(s)
    }

    fun isCommitted(): Boolean = text.isFinal

    fun length(): Int = text.get().length
}

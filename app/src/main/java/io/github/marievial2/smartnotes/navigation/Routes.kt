package io.github.marievial2.smartnotes.navigation

object Routes {

    const val NOTES = "notes"
    const val CATEGORIES = "categories"
    const val TAGS = "tags"
    const val EDITOR_NEW = "editor/new"
    const val EDITOR_EDIT = "editor/{noteId}"

    fun editorEdit(noteId: String) : String {
        return "editor/$noteId"
    }
}
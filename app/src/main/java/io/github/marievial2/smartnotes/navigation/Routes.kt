package io.github.marievial2.smartnotes.navigation

object Routes {
    const val HOME = "home"
    const val ADD = "add"
    const val DETAIL = "detail/{id}"

    fun detailRoute(id: String): String {
        return "detail/$id"
    }
}
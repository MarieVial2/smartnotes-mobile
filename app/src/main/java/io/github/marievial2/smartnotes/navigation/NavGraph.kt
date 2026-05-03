package io.github.marievial2.smartnotes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.github.marievial2.smartnotes.ui.categories.CategoriesScreen
import io.github.marievial2.smartnotes.ui.editor.EditorScreen
import io.github.marievial2.smartnotes.ui.notes.NotesScreen
import io.github.marievial2.smartnotes.ui.tags.TagsScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.CATEGORIES
    ) {
        composable(Routes.CATEGORIES){
            CategoriesScreen(navController)
        }
        composable(Routes.TAGS){
            TagsScreen(navController)
        }
        composable(Routes.NOTES){
            NotesScreen(navController)
        }
        composable(Routes.EDITOR_NEW){
            EditorScreen(navController)
        }
        composable(Routes.EDITOR_EDIT){
            EditorScreen(navController)
        }
    }
}
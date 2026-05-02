package io.github.marievial2.smartnotes.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {


        composable(Routes.HOME) {
            NotesScreen(
                navController = navController
            )
        }


        composable(Routes.ADD) {
            EditorScreen(
                navController = navController
            )
        }


    }
}

@Composable
fun NotesScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun EditorScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}
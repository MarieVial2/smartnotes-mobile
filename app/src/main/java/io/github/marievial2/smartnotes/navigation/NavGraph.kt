package io.github.marievial2.smartnotes.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.github.marievial2.smartnotes.ui.theme.screens.HomeScreen


@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {


        composable(Routes.HOME) {
            HomeScreen(
                navController = navController
            )
        }


        composable(Routes.ADD) {
            AddArticleScreen(
                navController = navController
            )
        }


    }
}
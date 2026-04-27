package com.example.smartnotes.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.smartnotes.ui.theme.screens.HomeScreen


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
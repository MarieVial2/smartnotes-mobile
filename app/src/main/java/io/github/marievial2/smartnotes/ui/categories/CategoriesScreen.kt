package io.github.marievial2.smartnotes.ui.categories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import io.github.marievial2.smartnotes.navigation.Routes

@Composable
fun CategoriesScreen(navController : NavHostController) {
    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Bienvenue sur SmartNotes")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text ("Catégories")

        Button(
            onClick ={
                navController.navigate(Routes.EDITOR_NEW)
            }
        ) {
            Text("Aller à l'éditeur")
        }
    }
}
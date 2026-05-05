package io.github.marievial2.smartnotes.ui.categories

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CategoriesScreen(navController : NavHostController) {
    Box(
        modifier=Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Bienvenue sur SmartNotes")
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Text ("Catégories")
    }
}
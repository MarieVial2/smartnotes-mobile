package io.github.marievial2.smartnotes.ui.tags

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun TagsScreen(navController : NavHostController) {
    Box(
        modifier=Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text ("Tags")
    }
}
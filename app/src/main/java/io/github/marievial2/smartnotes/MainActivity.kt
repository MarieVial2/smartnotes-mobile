package io.github.marievial2.smartnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Label
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.marievial2.smartnotes.navigation.AppNavGraph

import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.github.marievial2.smartnotes.navigation.Routes
import io.github.marievial2.smartnotes.ui.theme.SmartNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartNotesTheme {

                    MainScreen(
                    )

            }
        }
    }
}

@Composable
private fun MainScreen() {
    val navController = rememberNavController()
    //on utilise le state pour "abonner" et donc avertir quand la pile change : réactivité
    val backStackEntry by navController.currentBackStackEntryAsState()
    //On le permet à null pour quand NavHost n'a pas encore poussé la premiere desti sur la pile
    val currentRoute = backStackEntry?.destination?.route


//Un bool à utiliser pour savoir si on affiche la boottomBar
    val showBottomBar = currentRoute in listOf(
        Routes.NOTES,
        Routes.CATEGORIES,
        Routes.TAGS
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            if (showBottomBar) {
                AppBottomBar(navController, currentRoute)
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            AppNavGraph(navController)
        }


    }
}

//Données ici donc data class plutot que class
private data class TabItem(
    val route: String,
    val label: String,
    val icon: ImageVector
)


@Composable
private fun AppBottomBar(
    navController: NavHostController,
    currentRoute: String?
) {
    val tabs = listOf(
        TabItem(Routes.NOTES, "Notes", Icons.Filled.Description),
        TabItem(Routes.CATEGORIES, "Catégories", Icons.Filled.Folder),
        TabItem(Routes.TAGS, "Tags", Icons.Filled.Label)
    )

    NavigationBar {
        tabs.forEach { tab ->
            NavigationBarItem(
                //argument nommé, pas initialisation:
                selected = currentRoute == tab.route,
                //au lieu de selected = if(currentRoute == tab.route) {true}else false;
                onClick = {
                    navController.navigate(tab.route) {
                        // effacer la pile, accueil seulement reste (1 clic de l'accueil). On garde quand meme l'état de l'onglet ouvert
                        popUpTo(Routes.CATEGORIES) { saveState = true }
                        //on garde l'instance en cas de tap de l'onglet deja ouvert
                        launchSingleTop = true
                        //on restaure l'état (scroll, texte..) si on l'avait stocké plus haut :
                        restoreState = true
                    }
                },
                icon = { Icon(tab.icon, contentDescription = tab.label) },
                label = { Text(tab.label) }
            )
        }
    }
}

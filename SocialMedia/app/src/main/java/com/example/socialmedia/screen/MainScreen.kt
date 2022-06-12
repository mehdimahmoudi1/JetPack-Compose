package com.example.socialmedia.screen

import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.socialmedia.component.BottomNavigationView
import com.example.socialmedia.component.TopAppView

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var fullScreen by remember{ mutableStateOf(false)}
    Scaffold(
        topBar = {
            if (!fullScreen)TopAppView()
        },
        bottomBar = {
            if (!fullScreen)
            BottomNavigationView(navController)
        }
    ) {
        NavHost(navController = navController, startDestination = "Home") {
            composable("Home") {
                fullScreen = false
                HomeScreen(navController)
            }
            composable("Search") {
                fullScreen =true
                SearchScreen()
            }
            composable("Add") {
                fullScreen =true
                AddScreen()
            }
            composable("Activites") {
                fullScreen =true
                ActivityScreen()
            }
            composable("profile") {
                fullScreen =true
                ProfileScreen()
            }
            composable("showStory/{index}",
                arguments = listOf(navArgument("index") { type = NavType.IntType })
            ) { x ->
                fullScreen =true
                ShowStoryScreen(x.arguments?.get("index") as Int)
            }
        }
    }

}
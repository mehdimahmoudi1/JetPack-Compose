package com.example.socialmedia.component

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmedia.BottomNavigationItem
import com.example.socialmedia.ui.theme.AppGray
import com.example.socialmedia.ui.theme.Dark
import com.example.socialmedia.ui.theme.RedColor

@Composable
fun BottomNavigationView(navController: NavController) {
    var selectedRout by remember { mutableStateOf("Home") }

    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Search,
        BottomNavigationItem.Add,
        BottomNavigationItem.Activites,
        BottomNavigationItem.Profile
    )
    BottomAppBar(
        backgroundColor = if (isSystemInDarkTheme()) Dark else Color.White,
        contentColor = AppGray
    ) {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(painter = painterResource(id = it.icon), contentDescription = "")
                },
                selected = selectedRout == it.rout,
                selectedContentColor = RedColor,
                unselectedContentColor = AppGray,
                onClick = {
                    navController.navigate(it.rout) {
                        navController.graph.startDestinationRoute?.let { rout ->
                            selectedRout = rout
                            popUpTo(rout) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            )
        }
    }
}
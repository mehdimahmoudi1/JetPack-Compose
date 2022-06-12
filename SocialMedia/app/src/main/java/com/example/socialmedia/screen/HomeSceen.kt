package com.example.socialmedia.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.socialmedia.component.PostsView
import com.example.socialmedia.component.StoriesView
import com.example.socialmedia.data.MockData

@Composable
fun HomeScreen(navController: NavController) {
    Column {
    StoriesView(MockData.stories, navController = navController)
    Spacer(modifier = Modifier.height(7.dp))
    Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.padding(10   .dp,0.dp))
    PostsView(MockData.posts)
    }
}
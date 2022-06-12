package com.example.socialmedia.component

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bumptech.glide.Glide
import com.example.socialmedia.models.Story
import com.example.socialmedia.ui.theme.RedColor
import com.example.socialmedia.ui.theme.ShadowColor
import com.example.socialmedia.ui.theme.ViolatColor
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun StoriesView(stories: ArrayList<Story>, navController: NavController) {
    LazyRow {
        items(stories.size + 1) { index ->
            if (index == 0) {
                StoryItems(
                    story = Story(
                        "",
                        "https://holosen.net/wp-content/uploads/2021/09/story-05.jpeg",
                        false
                    ),
                    isMySelf = true,
                    navController = navController, index = 0
                )
            } else {
                StoryItems(stories[index - 1],index = index-1, navController = navController)
            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun StoryItems(
    story: Story,
    navController: NavController,
    index : Int,
    isMySelf: Boolean = false
) {
    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(4.dp),
        border = if (!isMySelf) BorderStroke(
            1.dp,
            if (story.isLive) Color.Red else ViolatColor
        ) else null,
        onClick = {
            if (!isMySelf) {
                navController.navigate("showStory/$index")
            } else {
                //ToDo : Complate
            }
        }
    ) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(60.dp)
        ) {
            GlideImage(
                imageModel = story.image,
                loading = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                    ) {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                    }
                },
                contentScale = ContentScale.Crop,
                failure = {
                    Text(text = "image request failed.")
                })
            Box(
                modifier = Modifier
                    .background(ShadowColor)
                    .fillMaxSize()
            )

            if (isMySelf) {
                Icon(
                    Icons.Filled.AddCircle, contentDescription = "",
                    Modifier
                        .align(Alignment.Center)
                        .size(30.dp),
                    tint = Color.White
                )
            }
            Text(
                text = story.username,
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
            if (story.isLive) {
                Text(
                    text = "live",
                    modifier = Modifier
                        .background(RedColor)
                        .align(Alignment.BottomCenter)
                        .padding(3.dp, 1.dp),
                    fontSize = 10.sp
                )
            }
        }
    }
}
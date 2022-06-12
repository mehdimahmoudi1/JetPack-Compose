package com.example.socialmedia.component

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmedia.models.Post
import com.example.socialmedia.ui.theme.AppGray
import com.example.socialmedia.ui.theme.RedColor
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun PostsView(posts: ArrayList<Post>) {
    LazyColumn {
        items(posts.size) { index ->
            PostItems(posts = posts[index])
        }
    }
}

@Composable
fun PostItems(posts: Post) {

    var liked by remember { mutableStateOf(false) }
    Column(modifier = Modifier.padding(8.dp)) {
        Row {
            Card(
                modifier = Modifier.size(40.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = 8.dp
            ) {
                GlideImage(
                    imageModel = posts.user.profImage,
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
            }
            Spacer(modifier = Modifier.size(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = posts.user.username, fontSize = 14.sp)
                Text(text = posts.location, fontSize = 10.sp, color = AppGray)
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Filled.MoreVert, contentDescription = "",
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            elevation = 8.dp
        ) {
            GlideImage(
                modifier = Modifier
                    .fillMaxSize()
                    .height(300.dp),
                imageModel = posts.image,
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
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            IconButton(onClick = { liked = !liked }) {
                Icon(
                    if (liked) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = "",
                    tint = if (liked) RedColor else AppGray
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.Share, contentDescription = "")
            }
        }
        Text(text = posts.caption, fontSize = 12.sp, color = AppGray, textAlign = TextAlign.Justify)
        Spacer(modifier = Modifier.height(8.dp))
    }
}
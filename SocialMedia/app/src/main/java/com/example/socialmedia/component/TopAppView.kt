package com.example.socialmedia.component

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmedia.ui.theme.RedColor
import com.example.socialmedia.ui.theme.ShadowColor
import com.example.socialmedia.ui.theme.SocialMediaTheme
import com.example.socialmedia.ui.theme.ViolatColor

@Preview
@Composable
fun TopAppView() {
    Row(Modifier.padding(10.dp, 10.dp)) {
        Text(
            text = "SocialMedia",
            color = if (isSystemInDarkTheme()) Color.White else ViolatColor,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .align(CenterVertically)
                .weight(1F),


            )
        IconButton(onClick = { /*TODO*/ }) {
            Box(contentAlignment = BottomEnd) {
                Icon(Icons.Filled.Send, contentDescription = "")
                Card(
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.size(14.dp)
                ) {

                    Text(
                        text = "+9",
                        color = Color.Red,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .fillMaxSize().background(ShadowColor),
                        textAlign = TextAlign.Center
                    )
                }

            }

        }

    }
}
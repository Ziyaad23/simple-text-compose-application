package com.ziyaad.simpletextcomposeapplication

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ziyaad.simpletextcomposeapplication.ui.theme.SimpleTextComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    GreetingText(name = "world")
                }
            }
}

@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            /* Set height separately
                .height(240.dp)
                .width(80.dp) */

            /* Set height and width */
            .size(width = 200.dp, height = 240.dp)

            /* Set height or width full screen
                .fillMaxSize() */

            /* Set height or width fraction of screen
                .fillMaxWidth(0.5f) */

            /* Add padding */
            .padding(24.dp)

            /* Add specific padding
            .padding(start = 24.dp, end = 10.dp, top = 10.dp, bottom = 20.dp) */

            /* Make text clickable */
            .clickable { println("Clickable text") },

            /* Important - Order of component is important */

        /* Custom Theme
        style = TextStyle(
            color = Blue,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        ), */

        /* Use material theme */
        style = MaterialTheme.typography.h5,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun GreetingButton(){
    Button(onClick = {  }) {
        GreetingText(name = "button")
        GreetingText(name = "remaining button")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        GreetingText(name = "world")
}
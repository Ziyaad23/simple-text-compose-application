package com.ziyaad.simpletextcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Text(text = "Hello $name!",
    modifier = Modifier
            /* Set height seperately
            .height(240.dp)
            .width(80.dp) */

            /* Set height and width */
            .size(width = 240.dp, height = 80.dp)

            /* Set height or width full screen
            .fillMaxSize() */

            /* Set height or width fraction of screen
            .fillMaxWidth(0.5f) */
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
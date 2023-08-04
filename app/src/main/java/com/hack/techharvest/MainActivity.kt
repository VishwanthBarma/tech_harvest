package com.hack.techharvest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hack.techharvest.ui.theme.TechHarvestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechHarvestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MyApp("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun MyApp(name: String) {
    val isDarkTheme = isSystemInDarkTheme() // Check if the system's dark theme is enabled
    TechHarvestTheme(darkTheme = isDarkTheme) { // Pass the dark theme flag to your app's theme
        // Your app's UI components here
        Text("Hello $name");
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TechHarvestTheme {
        MyApp("Android")
    }
}
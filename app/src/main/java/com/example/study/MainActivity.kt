package com.example.study

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.study.naviagtionStudy.navigation.Root
import com.example.study.ui.theme.StudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /* TODO: screen 관려 예시 코드
                  val scaffoldState = remember { SnackbarHostState() }
                   var isFirstScreen by remember { mutableStateOf(true) }

                   Scaffold(
                       snackbarHost = { SnackbarHost(hostState = scaffoldState) }
                   ) {
                       if (isFirstScreen) {
                           Screen1(
                               scaffoldState = scaffoldState,
                               onScreenChange = {
                                   isFirstScreen = false
                               },
                               //coroutineScope = lifecycleScope
                           )
                       } else {
                           Screen2()
                       }
                   }*/
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StudyTheme {
        Greeting("Android")
    }
}
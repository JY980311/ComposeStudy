package com.example.likelionstudy.effect.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun Screen1(
    scaffoldState: SnackbarHostState,
    onScreenChange: () -> Unit,
    coroutineScope: CoroutineScope = rememberCoroutineScope() // 아무 인자 안주면 rememberCoroutineScope 실행
) {
    Column {
        Button(
            onClick = {
                coroutineScope.launch {
                    scaffoldState.showSnackbar("Show Snackbar")
                }
            }
        ) {
            Text("Show Snackbar")
        }
        Button(
            onClick = {
                onScreenChange()
            }
        ) {
            Text("Navigate to another Screen")
        }
    }
}

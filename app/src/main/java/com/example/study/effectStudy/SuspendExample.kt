package com.example.study.effectStudy

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun performSlowTask() {
    println("performSlowTask before")
    delay(10000)
    println("performSlowTask after")
}

fun performSlowTaskBlocking() {
    println("performSlowTask before")
    Thread.sleep(10000)
    println("performSlowTask after")
}

@Composable
fun SideEffectExample3() {
    val coroutineScope = rememberCoroutineScope()
    var text = remember { mutableStateOf("") }

    Column {
        TextField(value = text.value, onValueChange = {text.value = it} )

        Button(onClick = {
            coroutineScope.launch {
                performSlowTask()
            }
        }) {
            Text(text = "Click me!")
        }

        Button(onClick = {
            performSlowTaskBlocking()
        }) {
            Text(text = "Click me! Blocking")
        }
    }
}

@Preview
@Composable
fun SideEffectExample3Preview() {
    SideEffectExample3()
}
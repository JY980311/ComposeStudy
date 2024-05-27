package com.example.study.naviagtionStudy.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    screenA: () -> Unit,
    screenB: () -> Unit
) {
    Column(
        Modifier.fillMaxSize(), Arrangement.Center, Alignment.CenterHorizontally
    ) {
        Text(text = "HOME", fontSize = 34.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick =  screenA ) {
            Text(text = "ScreenA")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick =  screenB ) {
            Text(text = "ScreenB")
        }
    }
}
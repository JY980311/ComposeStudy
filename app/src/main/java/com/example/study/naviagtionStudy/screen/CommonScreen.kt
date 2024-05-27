package com.example.study.naviagtionStudy.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CommonScreen(
    modifier: Modifier = Modifier,
    screenName: String,
    screenColor: Color,
    home: ()->Unit
    ) {
    Surface(
        modifier = modifier,
        color = screenColor
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "이 화면은 $screenName 입니다.", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(20.dp))
            ElevatedButton(onClick = home ) {
                Text(text = "Home")
            }
        }
    }
}

@Preview
@Composable
fun CommonScreenPreview() {
    CommonScreen(
        screenName = "home",
        screenColor = MaterialTheme.colorScheme.error,
        home = {}
    )
}
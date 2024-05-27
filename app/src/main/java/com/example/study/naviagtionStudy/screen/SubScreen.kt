package com.example.study.naviagtionStudy.screen

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ScreenA(
    modifier: Modifier = Modifier,
    home: () -> Unit
) {
    CommonScreen(screenName = "ScreenA", screenColor = MaterialTheme.colorScheme.error, home = home)
}

@Composable
fun ScreenB(
    modifier: Modifier = Modifier,
    home: () -> Unit
) {
    CommonScreen(screenName = "ScreenB", screenColor = MaterialTheme.colorScheme.primary, home = home)
}

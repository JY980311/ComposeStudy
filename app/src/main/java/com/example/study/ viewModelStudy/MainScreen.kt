package com.example.study.viewModelStudy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ComposableA(
    uiState: SampleData,
    viewModel: AppViewModel,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = { viewModel.countUp() }) {
            Text(text = "Count Up", fontSize = 24.sp)
        }
        Switch(checked = uiState.switchState, onCheckedChange = {
            viewModel.switchChange()
        })
        Button(onClick = { viewModel.resetCount() }) {
            Text(text = "Reset", fontSize = 24.sp)
        }
    }
}

@Composable
fun ComposableB(
    uiState: SampleData,
    modifier: Modifier = Modifier
) {
    Text(text = "${uiState.count}", fontSize = 36.sp)
}

@Composable
fun ComposableC(
    uiState: SampleData,
    modifier: Modifier = Modifier
) {
    Text(text = "${uiState.switchState}", fontSize = 36.sp)
}

@Composable
fun MainScreen(
    viewModel: AppViewModel
) {
    val uiState by viewModel.sampleData.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ComposableA(uiState = uiState, viewModel = viewModel)
        ComposableB(uiState = uiState)
        ComposableC(uiState = uiState)
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen(AppViewModel())
}
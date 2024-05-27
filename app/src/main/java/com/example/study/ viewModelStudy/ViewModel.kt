package com.example.study.viewModelStudy

import androidx.compose.runtime.currentComposer
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.isActive
import kotlinx.coroutines.flow.update

class AppViewModel:ViewModel() {

    private val _sampleData = MutableStateFlow(SampleData())
    val sampleData: StateFlow<SampleData> = _sampleData.asStateFlow()

    fun countUp() {
        _sampleData.update {  currentState ->
            currentState.copy(
                count = currentState.count + 1
            )
        }
    }

    fun switchChange() {
        _sampleData.update { currentState ->
            currentState.copy(
                switchState = !currentState.switchState
            )
        }
    }

    fun resetCount() {
        _sampleData.update { currentState ->
            currentState.copy(
                count = 0
            )
        }
    }
}
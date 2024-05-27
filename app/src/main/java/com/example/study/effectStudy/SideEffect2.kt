package com.example.likelionstudy.effect

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SideEffectExample() {

    var text by rememberSaveable { mutableStateOf("") }

    val scaffoldState = remember { SnackbarHostState() }

    LaunchedEffect(text) { // text 변수를 LauchedEffect의 key로 설정
        //이 블록은 text가 바뀔 때마다 취소되고 재수
        scaffoldState.showSnackbar(
            message = "Current Text is $text"
        )
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = scaffoldState) },
        content = {
            Column {
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it }
                )
            }
        }
    )
}

/*
key 값이 두 개 이상일 때 이렇게 사용하면 된다.
LaunchedEffect(text, number) { // text 변수를 LauchedEffect의 key로 설정
		//이 블록은 text가 바뀔 때마다 취소되고 재수
		scaffoldState.snackbarHostState.showSnackbar(
				message = "Current Text is $text Number is $number"
		)
	}
*/

@Preview
@Composable
fun SideEffectExamplePreview() {
    SideEffectExample()
}
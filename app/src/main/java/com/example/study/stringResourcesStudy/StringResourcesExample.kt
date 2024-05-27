package com.example.study.stringResourcesStudy

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.study.R

@Composable
fun StringResourcesExample() {
    //똑같은 text를 받을려고 할 때 굳이 하드코딩하는 것보다 string.xml에 저장해서 사용하는 것이 좋다.
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.button))
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.button))
        }
    }
}

@Preview
@Composable
fun StringResourcesExamplePreview() {
    StringResourcesExample()
}
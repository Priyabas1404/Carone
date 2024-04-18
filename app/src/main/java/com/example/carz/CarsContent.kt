package com.example.carz

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.carz.data.DataProvider

@Composable
fun CarsList() {
    val data = remember { DataProvider.carList }
    LazyColumn(contentPadding = PaddingValues(16.dp, vertical = 8.dp)){
        items(
            items = data,
            itemContent = {
                CarListItem(cardata = it)
            }
        )
    }
}
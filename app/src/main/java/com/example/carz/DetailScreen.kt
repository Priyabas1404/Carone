package com.example.carz

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.carz.data.Cardata

@Composable
fun DetailScreen(cardata: Cardata) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    CarHeader(
                        cardata = cardata,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )
                    CarContent(
                        cardata = cardata,
                        containerHeight = this@BoxWithConstraints.maxHeight
                    )
                }
            }
        }
    }
}

@Composable
private fun CarHeader(cardata: Cardata, containerHeight: Dp) {
    Image(
        modifier = Modifier
            .heightIn(containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = cardata.carImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun CarContent(cardata: Cardata, containerHeight: Dp) {
    Column {
        Cartitle(cardata = cardata)
        CarProperty(label = stringResource(id = R.string.car_make), value = cardata.make)
        CarProperty(label = stringResource(id = R.string.car_model), value = cardata.model)
        CarProperty(label = stringResource(id = R.string.car_year), value = cardata.year.toString())

        Spacer(modifier = Modifier.height((containerHeight - 320.dp).coerceAtLeast(0.dp)))
    }
}

@Composable
private fun Cartitle(cardata: Cardata) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = cardata.model,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun CarProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible
        )
    }
}
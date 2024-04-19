package com.example.carz

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.carz.data.Cardata
import com.example.carz.ui.theme.CarzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarzTheme {
                CarzApp {
                    startActivity(CarDetailActivity.newIntent(this, it))
                }
            }
        }
    }
}

@Composable
fun CarzApp(navigateToProfile: (Cardata) -> Unit) {
    Scaffold(
        content = {
            CarsList(navigateToProfile = navigateToProfile)
        }
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    CarzTheme {
        CarzApp { }
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    CarzTheme(darkTheme = true) {
        CarzApp { }
    }
}
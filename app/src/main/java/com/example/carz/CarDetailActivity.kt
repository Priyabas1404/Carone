package com.example.carz

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.carz.data.Cardata
import com.example.carz.ui.theme.CarzTheme

class CarDetailActivity : ComponentActivity() {

    private val cardata: Cardata by lazy{
        intent?.getSerializableExtra(CAR_ID) as Cardata
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarzTheme {
                DetailScreen(cardata = cardata)
            }
        }
    }

    companion object{
        private const val CAR_ID = "car_id"
        fun newIntent(context: Context, cardata: Cardata) =
            Intent(context, CarDetailActivity::class.java).apply{
                putExtra(CAR_ID, cardata)
            }
    }
}
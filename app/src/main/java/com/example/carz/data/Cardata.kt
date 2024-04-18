package com.example.carz.data

data class Cardata(
    val id: Int,
    val model: String,
    val make: String,
    val year: Int,
    val carImageId: Int = 0
)
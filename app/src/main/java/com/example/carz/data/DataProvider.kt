package com.example.carz.data

import com.example.carz.R

object DataProvider {

    val cardata = Cardata(
        id = 1,
        model = "Kia",
        make = "Nero",
        year = 2019,
        carImageId = R.drawable.image1
    )

    val carList = listOf(
        cardata,
        Cardata(
            id = 2,
            model = "Toyota",
            make = "Camry",
            year = 2019,
            carImageId = R.drawable.image2
        ),
        Cardata(
            id = 3,
            model = "Nissan",
            make = "Altima",
            year = 2019,
            carImageId = R.drawable.image2
        ),
        Cardata(
            id = 4,
            model = "Tesla",
            make = "Model X",
            year = 2019,
            carImageId = R.drawable.image4
        ),
        Cardata(
            id = 5,
            model = "Hyundai",
            make = "Kona Electric",
            year = 2019,
            carImageId = R.drawable.image5
        ),
        Cardata(
            id = 6,
            model = "Volskwagen",
            make = "Nero",
            year = 2019,
            carImageId = R.drawable.image6
        ),
        Cardata(
            id = 7,
            model = "Mercedes",
            make = "B-class",
            year = 2019,
            carImageId = R.drawable.image7
        ),
        Cardata(
            id = 8,
            model = "Chevy",
            make = "Bolt",
            year = 2019,
            carImageId = R.drawable.image8
        ),
        Cardata(
            id = 9,
            model = "Ford",
            make = "Focus Electric",
            year = 2019,
            carImageId = R.drawable.image9
        ),
        Cardata(
            id = 10,
            model = "Skoda",
            make = "Enyaq",
            year = 2019,
            carImageId = R.drawable.image10
        ))
}
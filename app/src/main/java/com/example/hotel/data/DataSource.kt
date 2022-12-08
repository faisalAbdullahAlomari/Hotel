package com.example.hotel.data

import com.example.hotel.R
import com.example.hotel.model.Hotel

class DataSource {

    fun loadHotels() : List<Hotel>{
        return listOf(
            Hotel(R.string.hotel1, R.drawable.image1),
            Hotel(R.string.hotel2, R.drawable.image2),
            Hotel(R.string.hotel3, R.drawable.image3),
            Hotel(R.string.hotel4, R.drawable.image4)
        )
    }
}
package com.example.hotel.data

import com.example.hotel.R
import com.example.hotel.model.Hotel

class DataSource {

    fun loadHotels() : List<Hotel>{
        return listOf(
            Hotel(R.string.hotel1),
            Hotel(R.string.hotel2),
            Hotel(R.string.hotel3),
            Hotel(R.string.hotel4)
        )
    }
}
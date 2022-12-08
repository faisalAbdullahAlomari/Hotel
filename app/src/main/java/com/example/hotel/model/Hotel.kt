package com.example.hotel.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hotel(
    @StringRes val hotelName : Int,
    @DrawableRes val hotelImage : Int
    )

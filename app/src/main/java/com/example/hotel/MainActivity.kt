package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.adapter.HotelsAdapter
import com.example.hotel.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hotelList = DataSource().loadHotels()

        val adapter = HotelsAdapter(hotelList,this)

        val recyclerView : RecyclerView = findViewById(R.id.rv)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

    }


}
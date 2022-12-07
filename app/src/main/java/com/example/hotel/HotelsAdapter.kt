package com.example.hotel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.model.Hotel

class HotelsAdapter(
    private val dataset: List<Hotel>,
    private val context: Context
)
    : RecyclerView.Adapter<HotelsAdapter.HotelViewHolder>(){

        class HotelViewHolder(view : View):RecyclerView.ViewHolder(view){
            val textView : TextView = view.findViewById(R.id.tvText)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hotel, parent, false)

        return HotelViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.roomType)
    }
    override fun getItemCount() = dataset.size
    }
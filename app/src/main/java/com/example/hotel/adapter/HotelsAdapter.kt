package com.example.hotel.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hotel.R
import com.example.hotel.model.Hotel

class HotelsAdapter(
    private val dataset: List<Hotel>,
    private val context: Context
)
    : RecyclerView.Adapter<HotelsAdapter.HotelViewHolder>(){

        class HotelViewHolder(view : View):RecyclerView.ViewHolder(view){
            val textView : TextView = view.findViewById(R.id.tvText)
            val imageView : ImageView = view.findViewById(R.id.imageV)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {

        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_hotel, parent, false)

        return HotelViewHolder(itemLayout)
    }
    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.hotelName)
        holder.imageView.setImageResource(item.hotelImage)
    }
    override fun getItemCount() = dataset.size

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val hotelName : TextView = view.findViewById(R.id.tvText)
        val hotelImage : ImageView = view.findViewById(R.id.imageV)
    }


    }
package com.example.weatherforecast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter(private val context: Context, private val city: String)
    : RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    //private val weatherForecasts: List<String> = TODO()


    class WeatherViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_weather, parent, false)
        return WeatherViewHolder(adapterLayout)
    }

    override fun getItemCount() = 10//weatherForecasts.size

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        //val item = dataset[position]
        holder.textView.text = "asdsadadada"//context.resources.getString(item.stringResourceId)
        //holder.imageView.setImageResource(item.imageResourceId)
    }
}
package com.amrilhs.aplikasiwisatasibolga.ui.hotel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataHotel
import kotlinx.android.synthetic.main.item_sibolga_hotel.view.*
import java.util.*

class HotelAdapter(private val listHotel: ArrayList<DataHotel>) : RecyclerView.Adapter<HotelAdapter.hotelViewHolder>() {

    inner class hotelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(dataHotel: DataHotel) {
            itemView.imgHotelXml.setImageResource(dataHotel.imgHotel)
            itemView.txtHotelnameXml.text = dataHotel.nameHotel
            itemView.deschotelXml.text = dataHotel.descHotel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hotelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_sibolga_hotel, parent, false)
        return hotelViewHolder(view)
    }

    override fun onBindViewHolder(holder: hotelViewHolder, position: Int) {
        holder.bindItems(listHotel[position])
        val dataHotel =listHotel[position]
        holder.itemView.setOnClickListener {
            val hotelIntent = DataHotel(
                dataHotel.imgHotel,
                dataHotel.nameHotel,
                dataHotel.descHotel,
                dataHotel.latO,
                dataHotel.latI,
                dataHotel.zoomOut

            )
            val mIntent= Intent(it.context, HotelMapsActivity::class.java)
            mIntent.putExtra(HotelMapsActivity.EXTRA_DETAIL, hotelIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }
}
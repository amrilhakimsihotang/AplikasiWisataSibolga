package com.amrilhs.aplikasiwisatasibolga.ui.resto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataResto
import kotlinx.android.synthetic.main.item_sibolga_resto.view.*

class RestoAdapter(private val listResto: ArrayList<DataResto>):
        RecyclerView.Adapter<RestoAdapter.restoViewHolder>() {

     inner class restoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun binItems(dataResto: DataResto){
            itemView.imgrestoXml.setImageResource(dataResto.imgResto)
            itemView.restonameXml.text= dataResto.nameResto
            itemView.descrestolXml.text=dataResto.descResto

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): restoViewHolder {
        val view= LayoutInflater.from(parent.context).
        inflate(R.layout.item_sibolga_resto,parent,false)
        return restoViewHolder(view)
    }

    override fun onBindViewHolder(holder: restoViewHolder, position: Int) {
       holder.binItems(listResto[position])
    }

    override fun getItemCount(): Int {
    return listResto.size
    }
}
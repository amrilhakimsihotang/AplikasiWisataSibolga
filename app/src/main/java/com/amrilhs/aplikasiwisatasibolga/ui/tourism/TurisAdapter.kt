package com.amrilhs.aplikasiwisatasibolga.ui.tourism

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataTuris
import kotlinx.android.synthetic.main.item_sibolga_tourism.view.*

class TurisAdapter(val listTuris: ArrayList<DataTuris>) :
    RecyclerView.Adapter<TurisAdapter.turisViewHolder>() {

    inner class turisViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(dataTuris: DataTuris) {
            itemView.list_image.setImageResource(dataTuris.url)
            itemView.txtName.text = dataTuris.place
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): turisViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sibolga_tourism, parent, false)
        return turisViewHolder(view)
    }

    override fun onBindViewHolder(holder: turisViewHolder, position: Int) {
        holder.bindItems(listTuris[position])
        val dataTuris = listTuris[position]
        holder.itemView.setOnClickListener {
            val dataTurisIntent = DataTuris(
                dataTuris.url,
                dataTuris.place,
                dataTuris.desc
            )
            // aksi pindah data menggunakan activity(bukan fragment)
            val mIntent = Intent(it.context, DetailTurisFragment::class.java)
            mIntent.putExtra(DetailTurisFragment.EXTRA_DETAIL, dataTurisIntent)
            it.context.startActivity(mIntent)

        }
    }

    override fun getItemCount(): Int {
        return listTuris.size
    }
}
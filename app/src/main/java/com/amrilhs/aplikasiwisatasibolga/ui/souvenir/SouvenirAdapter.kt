package com.amrilhs.aplikasiwisatasibolga.ui.souvenir

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataSouvenir
import kotlinx.android.synthetic.main.item_sibolga_souvenir.view.*

class SouvenirAdapter(private val listSouvenir: ArrayList<DataSouvenir>) :
    RecyclerView.Adapter<SouvenirAdapter.souvenirViewHolder>() {

    inner class souvenirViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binItems(dataSouvenir: DataSouvenir) {
            itemView.imgsouvenirXml.setImageResource(dataSouvenir.imgSouvenir)
            itemView.namesouvernirXml.text = dataSouvenir.nameSouvenir
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): souvenirViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sibolga_souvenir, parent, false)
        return souvenirViewHolder(view)
    }

    override fun onBindViewHolder(holder: souvenirViewHolder, position: Int) {
        holder.binItems(listSouvenir[position])
        val dataSouvenir =listSouvenir[position]
        holder.itemView.setOnClickListener {
            val souvenirIntent =DataSouvenir(
                dataSouvenir.imgSouvenir,
                dataSouvenir.nameSouvenir,
                dataSouvenir.descSouvenir,
                dataSouvenir.latO,
                dataSouvenir.latI,
                dataSouvenir.zoomOut

            )
            val mIntent= Intent(it.context,CangaMapsActivity::class.java)
            mIntent.putExtra(CangaMapsActivity.EXTRA_DETAIL, souvenirIntent)
            it.context.startActivity(mIntent)
        }
    }

    override fun getItemCount(): Int {
        return listSouvenir.size
    }
}
package com.amrilhs.aplikasiwisatasibolga.ui.tourism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataTuris
import kotlinx.android.synthetic.main.fragment_detail_turis.*


class DetailTurisFragment : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail_turis)
        //set title dari string turis
        supportActionBar?.title=getString(R.string.menu_tourism)
       //ambil data array dari TourismFragment
        val dataTuris = intent.getParcelableExtra<DataTuris>(EXTRA_DETAIL) as DataTuris
        det_image.setImageResource(dataTuris.url)
        det_Name.text= dataTuris.place
        det_desc.text= dataTuris.desc



    }

}
package com.amrilhs.aplikasiwisatasibolga.ui.resto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataResto
import kotlinx.android.synthetic.main.fragment_resto.*


class RestoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayResto = ArrayList<DataResto>()
        arrayResto.add(
                DataResto(
                        R.drawable.restopaknas,"Restoran Pak Nas","Jl. Brigjen Katamso No.40, Kota Beringin, Kec. Sibolga Kota, Kota Sibolga"
                )
        )
        arrayResto.add(
                DataResto(
                        R.drawable.restormthamrin,"Rumah Makan Thamrin","Jl. M.H. Thamrin No. 7/9, Sibolga Indonesia"
                )
        )
        arrayResto.add(
                DataResto(
                        R.drawable.restomartabakmesir,"Martabak Kairo PHR Sambas","Jl. Elang No.3, Pancuran Bambu, Kec. Sibolga Sambas, Kota Sibolga."
                )
        )
        arrayResto.add(
                DataResto(
                        R.drawable.restoikanbakarsarilautsibolga,"Ikan Bakar Sari Laut Sibolga","Jl. S.Parman No.70, Pasar Baru, Kec. Sibolga Kota, Kota Sibolga."
                )
        )
        arrayResto.add(
            DataResto(
                R.drawable.rumahmakanapoek,"Rumah Makan Apoek","Jl. MH. Thamrin, Kota Beringin, Kec. Sibolga Kota, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.mietektekekborregsibolga,"Mie Tek-Tek Borreg Sibolga","Jl. Sisingamangaraja No.8, Pancuran Gerobak,Kec. Sibolga Kota, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.cahayaminangrumahmakan,"Cahaya Minang Rumah Makan","Jl. Sisingamangaraja No.999, Aek Parombunan,Kec. Sibolga Selatan, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.baksopakminsibolga,"Warung Bakso Pak Min","Pancuran Kerambil, Kec. Sibolga Sambas, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.kedaikopibahagia,"Kedai Kopi Bahagia","Jl. Imam Bonjol No.70, Pasar Baru, Kec. Sibolga Kota, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.rumahmakanmedanseafood,"Rumah Makan Medan Seafood","Jl. Imam Bonjol No.27, Pasar Baru, Kec. Sibolga Kota, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.nasitue,"Nasi Tue","Jl. Ahmad Yani No.14, Pasar Baru, Kec. Sibolga Kota, Kota Sibolga."
            )
        )
        arrayResto.add(
            DataResto(
                R.drawable.sibolgasquare,"Sibolga Square","Jl. Ahmad Yani, Ps. Baru, Sibolga Kota, Kota Sibolga, Sumatera Utara 22513."
            )
        )

        val restoAdapter=RestoAdapter(arrayResto)
        rc_resto_xml.layoutManager= LinearLayoutManager(this.context)
        rc_resto_xml.adapter=restoAdapter

    }
}
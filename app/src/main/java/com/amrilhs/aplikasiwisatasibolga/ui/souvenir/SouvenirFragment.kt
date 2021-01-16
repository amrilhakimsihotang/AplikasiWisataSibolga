package com.amrilhs.aplikasiwisatasibolga.ui.souvenir

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataSouvenir
import kotlinx.android.synthetic.main.fragment_souvenir.*


class SouvenirFragment : Fragment() {
    companion object {
        val TAG =  SouvenirFragment::class.java.simpleName
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_souvenir, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arraySouvenir = ArrayList<DataSouvenir>()
        arraySouvenir.add(
            DataSouvenir(
                R.drawable.souvenirchanga,"Kerupuk Sambal Teri Sibolga","Jl. Perintis Kemerdekaan, Ps. Belakang, Sibolga Kota, Sumatera Utara 22523",1.737897,98.777213,19.0f
            )
        )
        arraySouvenir.add(
            DataSouvenir(
                R.drawable.souvenirkerupuksambalspesial,"Kerupuk Sambal Spesial","Jl. Patuangi No.49D, Pancuran Gerobak, Sibolga Kota, Sumatera Utara 22511",1.739205,98.783374,18.0f
            )
        )
        arraySouvenir.add(
            DataSouvenir(
                R.drawable.souvenirikanterisibolga,"Aritra Raja Ikan Asin","Jl. S.Parman No.125, Ps. Belakang, Sibolga Kota, Kota Sibolga, Sumatera Utara 22523",1.736741,98.779359,19.0f
            )
        )
        arraySouvenir.add(
            DataSouvenir(
                R.drawable.souvenirkacangjambu,"Kacang Ani Kebun Jambu","Jl. Gambolo No.16, Pancuran Kerambil, Sibolga Sambas, Kota Sibolga, Sumatera Utara 22531",1.735086,98.786772,19.0f
            )
        )


        val souvenirAdapter= SouvenirAdapter(arraySouvenir)
        rc_souvenir_xml.layoutManager= LinearLayoutManager(this.context)
        rc_souvenir_xml.adapter=souvenirAdapter
    }
}
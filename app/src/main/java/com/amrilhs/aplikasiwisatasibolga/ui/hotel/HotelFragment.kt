package com.amrilhs.aplikasiwisatasibolga.ui.hotel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataHotel
import kotlinx.android.synthetic.main.fragment_hotel.*
import java.util.*

class HotelFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrayHotel = ArrayList<DataHotel>()
        arrayHotel.add(
                DataHotel(
                        R.drawable.hotelprimaindah,"Hotel Prima Indah-www.traveloka.com","Alamat: Jl. Brigjend Katamso No. 45, Sibolga Kota, Sibolga, Sumatera Utara, Indonesia, 22522\n" +
                        "Nomor telepon: (0631) 22872",1.740740,98.776788,19.0f
                )
        )
        arrayHotel.add(
                DataHotel(
                        R.drawable.piahotel,"Hotel Pia-www.agoda.com","Alamat: Jl. Padang Sidempuan No. 10A, Pandan, Sibolga, Sumatera Utara 22537\n" +
                        "Nomor telepon: (0631) 372145",1.682359,98.821241,19.0f
                )
        )
        arrayHotel.add(
                DataHotel(
                        R.drawable.hotelwisataindah,"Hotel Wisata Indah","Alamat: Jl. Brigjen Katamso No. 51, Pasar Baru, Sibolga Kota, Sumatera Utara 22522\n" +
                        "Nomor telepon: (0631) 23688",1.740085,98.775077,18.0f
                )
        )
        arrayHotel.add(
                DataHotel(
                        R.drawable.romeresidencesibolga,"Rome Residence-booking.com","Alamat: Jl. Zainul Basri Hutagalung No. 19, Aek Tolang, Pandan, Kota Sibolga, Sumatera Utara 22611\n" +
                        "Nomor telepon: 085211154700",1.690555,98.832032,18.0f
                )
        )
        arrayHotel.add(
                DataHotel(
                        R.drawable.hoteldarussalam,"Hotel Syariah Cn Darussalam","Alamat: Jalan Imam Bonjol No. 47 Sibolga , Sibolga Kota, Sibolga, Sumatera Utara, Indonesia, 22522",1.740297,98.780004,17.0f
                )
        )
        //masukkan data array ke dalam recyclerview
        val hotelAdapter = HotelAdapter(arrayHotel)
        rc_hotel_xml.layoutManager = LinearLayoutManager(this.context)
        rc_hotel_xml.adapter = hotelAdapter
    }
}
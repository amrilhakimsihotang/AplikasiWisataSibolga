package com.amrilhs.aplikasiwisatasibolga.ui.hospital

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.amrilhs.aplikasiwisatasibolga.R
import kotlinx.android.synthetic.main.fragment_hospital.*

class HospitalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hospital, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtweb.setOnClickListener {
            val intent = Intent(it.context, WebrsTobingActivity::class.java)
            it.context.startActivity(intent)

        }
        txtwebmetta.setOnClickListener {
            val intent = Intent(it.context, WebrsMettaActivity::class.java)
            it.context.startActivity(intent)
        }
        txtalamat.setOnClickListener {
            val intent= Intent(it.context,RsTobingMapsActivity::class.java)
            it.context.startActivity(intent)
        }
        txtalamatmetta.setOnClickListener {
            val intent=Intent(it.context,RsMettaMapsActivity::class.java)
            it.context.startActivity(intent)
        }
        txtalamtpandan.setOnClickListener {
            val intent=Intent(it.context,RsPandanMapsActivity::class.java)
            it.context.startActivity(intent)
        }

        imgrstobing.setOnClickListener {
            val intent = Intent(it.context, WebrsTobingActivity::class.java)
            it.context.startActivity(intent)
        }
        imgrsmetta.setOnClickListener {
            val intent = Intent(it.context, WebrsMettaActivity::class.java)
            it.context.startActivity(intent)

        }
        imgrspandan.setOnClickListener {
            val intent=Intent(it.context,RsPandanMapsActivity::class.java)
            it.context.startActivity(intent)
        }

    }
}

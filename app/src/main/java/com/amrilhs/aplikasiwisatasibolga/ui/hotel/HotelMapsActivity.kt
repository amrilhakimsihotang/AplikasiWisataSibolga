package com.amrilhs.aplikasiwisatasibolga.ui.hotel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amrilhs.aplikasiwisatasibolga.R
import com.amrilhs.aplikasiwisatasibolga.model.DataHotel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import kotlinx.android.synthetic.main.fragment_detail_turis.*

class HotelMapsActivity : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    private lateinit var mMap: GoogleMap
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    var a: Double = 0.0 //untuk titik kordinat
    var b: Double = 0.0 // untuk titik kordinat
    var c: Float = 0.0f//untuk zoomout kamera

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        supportActionBar?.title = getString(R.string.menu_hotel)
        //ambildata souvenir
        val dataHotel = intent.getParcelableExtra<DataHotel>(HotelMapsActivity.EXTRA_DETAIL) as DataHotel
        det_image.setImageResource(dataHotel.imgHotel)
        det_Name.text = dataHotel.nameHotel
        det_desc.text = dataHotel.descHotel
        a = dataHotel.latO
        b = dataHotel.latI
        c = dataHotel.zoomOut

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera

        val myPlace1 = LatLng(a, b)
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myPlace1))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myPlace1, c))
        mMap.getUiSettings().setZoomControlsEnabled(true)
        mMap.setOnMarkerClickListener(this)
    }

    override fun onMarkerClick(p0: Marker?) = false
}
package com.amrilhs.aplikasiwisatasibolga.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Tahukah Anda bahwa Sibolga merupakan salah satu tempat favorit yang ada di Sumatera Utara? Wilayah ini memiliki destinasi wisata yang sangat eksotis dengan jarak tempuh 8 jam dari Medan. \n\n" +
                "Daerah barat Sibolga merupakan pesisir yang membentang antara utara dan selatan, tidak heran jika wisata yang dihadirkan berupa pantai dan pulau yang memukau.\n\n" +
                "Aplikasi ini menyajikan informasi seputar Lokasi wisata, kuliner atau restoran, perhotelan, rumah sakit yang kami himpun dari beberapa media informasi online. \n" +
                "Semoga aplikasi informasi wisata Sibolga ini bisa mengobati rasa penasaran untuk berkunjug saat berlibur."
    }
    val text: LiveData<String> = _text
}
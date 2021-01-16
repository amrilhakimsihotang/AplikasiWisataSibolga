package com.amrilhs.aplikasiwisatasibolga.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataHotel(
        var imgHotel: Int = 0,
        var nameHotel: String = "",
        var descHotel: String = "",
        var latO: Double=0.0,
        var latI: Double=0.0,
        var zoomOut: Float= 0.0F
): Parcelable

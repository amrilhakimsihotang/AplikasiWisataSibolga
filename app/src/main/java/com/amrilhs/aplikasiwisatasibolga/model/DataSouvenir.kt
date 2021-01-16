package com.amrilhs.aplikasiwisatasibolga.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
@Parcelize
class DataSouvenir (
    var imgSouvenir: Int = 0,
    var nameSouvenir: String = "",
    var descSouvenir: String = "",
    var latO: Double=0.0,
    var latI: Double=0.0,
    var zoomOut: Float= 0.0F
): Parcelable
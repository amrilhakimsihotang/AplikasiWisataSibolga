package com.amrilhs.aplikasiwisatasibolga.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataTuris(
    var url: Int = 0,
    var place: String = "",
    var desc: String = ""
):Parcelable
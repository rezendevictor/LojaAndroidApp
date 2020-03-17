package com.example.kloja.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.layout_liststocks.view.*
import java.io.Serializable

@Parcelize
data class listMoney_Model(var money : MutableList<Money_Model>) : Parcelable

@Parcelize
data class Money_Model (var name : String,
                        var code : String,
                        var rate : Float) : Parcelable
package com.example.kloja.API

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Moeda(
    @SerializedName("Realtime Currency Exchange Rate")
    val rate: Rate
) : Parcelable


@Parcelize
data class Rate(
    @SerializedName("1. From_Currency Code")
    val From_currency_Code: String,
    @SerializedName("2. From_Currency Name")
    val From_currency_Name: String,
    @SerializedName("3. To_Currency Code")
    val To_currency_Code: String,
    @SerializedName("4. To_Currency Name")
    val To_currency_Name: String,
    @SerializedName("5. Exchange Rate")
    val Exchange_rate: Double,
    @SerializedName("6. Last Refreshed")
    val Last_Refreshed: Date,
    @SerializedName("7. Time Zone")
    val Time_zone: String,
    @SerializedName("8. Bid Pric")
    val Bidprice: Double,
    @SerializedName("9. Ask Price")
    val Ask_price: Double
) : Parcelable
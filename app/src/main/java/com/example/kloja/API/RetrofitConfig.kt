package com.example.kloja.API

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import java.util.*

interface RetrofitConfig {

   @GET("/query")
   suspend fun getMoeda(
      @Query("function") function: String,
      @Query("from_currency") from: String,
      @Query("to_currency") to: String,
      @Query("apikey") apikey: String
   ): Call<Moeda>
}

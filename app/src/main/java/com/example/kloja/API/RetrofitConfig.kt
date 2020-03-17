package com.example.kloja.API

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface RetrofitConfig {

   @GET("query?function=CURRENCY_EXCHANGE_RATE&from_currency={from_EXC}" +
           "&to_currency={to_EXC}&apikey=V2M7T3DPN0USL9LB")
   suspend fun getMoeda(@Path("from_EXC") from : String,@Path("to_EXC") to : String) : Response<Moeda>
}
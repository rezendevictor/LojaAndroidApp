package com.example.kloja.API


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class API_consume {


    fun get_moeda(): RetrofitConfig {


        var interceptor = HttpLoggingInterceptor()
            .setLevel(Level.BODY)

        var client = OkHttpClient.Builder()
            .addInterceptor(interceptor).build()


        var retro = Retrofit.Builder()
            .baseUrl("https://www.alphavantage.co/")
            .client(client)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retro.create(RetrofitConfig::class.java)

    }
}



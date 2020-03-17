package com.example.kloja.API

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

private class CustomInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        /*
        chain.request() returns original request that you can work with(modify, rewrite)
        */
        val request: Request = chain.request()
        // Here you can rewrite the request
        /*
        chain.proceed(request) is the call which will initiate the HTTP work. This call invokes the
        request and returns the response as per the request.
        */
        //Here you can rewrite/modify the response
        return chain.proceed(request)
    }
}
package com.example.apigithubmvvm.remote.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    fun <T> initRetrofit(service: Class<T>): T =
       Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
           .create(service)

    private const val BASE_URL = "https://api.github.com/"
}
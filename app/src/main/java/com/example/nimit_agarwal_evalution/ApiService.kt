package com.example.nimit_agarwal_evalution

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("/search?term=[from search view]")
    fun  getUSer(@Query("post") postId:String): Call<ResponseDTO>


}
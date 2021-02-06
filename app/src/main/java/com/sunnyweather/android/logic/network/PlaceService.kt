package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v3/config/district?key=${SunnyWeatherApplication.TOKEN}")
    fun searchPlace(
        @Query("keywords") keywords: String,
        @Query("subdistrict") subdistrict: Int
    ): Call<PlaceResponse>
}
//https://restapi.amap.com/v3/config/district?keywords=北京&subdistrict=2&key=<用户的key>
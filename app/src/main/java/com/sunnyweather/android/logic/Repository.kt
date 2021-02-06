package com.sunnyweather.android.logic

import android.util.Log
import androidx.lifecycle.liveData
import com.sunnyweather.android.logic.model.District
import com.sunnyweather.android.logic.network.SunnyWeatherNetWork
import kotlinx.coroutines.Dispatchers

object Repository {
    fun searchPlaces(keywords: String, subdistrict: Int=1) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetWork.searchPlace(keywords, subdistrict)
            if (placeResponse.status == "1") {
                Log.d("Repository",placeResponse.districts.toString())
                val places = placeResponse.districts
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<District>>(e)
        }
        emit(result)
    }
}
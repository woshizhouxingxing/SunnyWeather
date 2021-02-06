package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.District

class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<District>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { keywords ->
        Repository.searchPlaces(keywords)
    }

    fun searchPlaces(keywords: String) {
        searchLiveData.value = keywords
    }
}
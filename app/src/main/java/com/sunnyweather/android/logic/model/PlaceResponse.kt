package com.sunnyweather.android.logic.model

data class PlaceResponse(
    val status: String,
    val info: String,
    val infocode: String,
    val districts: List<District>
)

data class District(val citycode:Any, val adcode:String, val name:String, val center:String, val level:String, val districts:List<District>)



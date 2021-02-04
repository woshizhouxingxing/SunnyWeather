package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "aebeaf667b13a419c35cd7516140053b"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object {
        lateinit var context: Context
        const val TOKEN = "2a9fb1ce7f70ec724a9cc7a56fcb94d2"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

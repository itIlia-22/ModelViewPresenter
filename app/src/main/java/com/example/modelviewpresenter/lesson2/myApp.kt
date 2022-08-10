package com.example.modelviewpresenter.lesson2

import android.app.Application
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router

class myApp:Application() {
    companion object{
        lateinit var instance:myApp
    }

    private val cicerone: Cicerone<Router> by lazy {
        Cicerone.create()
    }

    val navigatorHolder get() = cicerone.getNavigatorHolder()
    val router get() = cicerone.router

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}
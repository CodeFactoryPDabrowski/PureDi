package com.codefactorypdabrowski.puredi.app

import android.app.Application
import com.codefactorypdabrowski.puredi.basedi.app.AppComponent
import com.codefactorypdabrowski.puredi.basedi.app.AppModule

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent =
            AppComponent(
                AppModule(this)
            )
    }
}
package com.codefactorypdabrowski.puredi.basedi.app

import android.content.Context
import com.codefactorypdabrowski.puredi.app.App

class AppModule(app: App) {
    val appContext: Context = app
}
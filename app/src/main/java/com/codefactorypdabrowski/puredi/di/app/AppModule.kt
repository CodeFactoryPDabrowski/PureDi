package com.codefactorypdabrowski.puredi.di.app

import android.content.Context
import com.codefactorypdabrowski.puredi.app.App

/**
 * Base module for app, creates common singletons that can be used in others app component modules.
 */
class AppModule(app: App) {
    val appContext: Context = app
}

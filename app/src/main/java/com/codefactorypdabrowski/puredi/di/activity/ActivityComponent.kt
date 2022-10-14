package com.codefactorypdabrowski.puredi.di.activity

import com.codefactorypdabrowski.puredi.di.app.AppComponent

/**
 * Holds modules that creates objects for activities
 */
abstract class ActivityComponent(
    protected val appComponent: AppComponent,
    protected val activityModule: ActivityModule
)

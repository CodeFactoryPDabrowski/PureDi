package com.codefactorypdabrowski.puredi.basedi.activity

import com.codefactorypdabrowski.puredi.basedi.app.AppComponent

/**
 * Holds modules that creates objects for activities
 */
abstract class BaseActivityComponent(
    protected val appComponent: AppComponent,
    protected val activityModule: ActivityModule
)
package com.codefactorypdabrowski.puredi.di.activity

import android.app.Activity
import android.content.Context

/**
 * Base module for activities, creates context and common objects for all activities
 */
class ActivityModule(activity: Activity) {
    val activityContext: Context = activity
}

package com.codefactorypdabrowski.puredi.basedi.activity

import android.content.Context
import com.codefactorypdabrowski.puredi.activity.BaseActivity

/**
 * Base module for activities, creates context and common objects for all activities
 */
class ActivityModule(baseActivity: BaseActivity) {
    val activityContext: Context = baseActivity
}
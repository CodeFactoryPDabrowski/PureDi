package com.codefactorypdabrowski.puredi.basedi.activity

import android.content.Context
import com.codefactorypdabrowski.puredi.activity.BaseActivity

class ActivityModule(baseActivity: BaseActivity) {
    val activityContext: Context = baseActivity
}
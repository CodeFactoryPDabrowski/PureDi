package com.codefactorypdabrowski.puredi.activity

import android.os.Bundle
import com.codefactorypdabrowski.puredi.app.App
import com.codefactorypdabrowski.puredi.basedi.activity.BaseActivityComponent
import com.codefactorypdabrowski.puredi.basedi.app.AppComponent

/**
 * Activities that requires dependency injection would use this class
 */
abstract class BaseDiActivity<T> : BaseActivity() where T : BaseActivityComponent {

    /**
     * Can be shared between activity and fragment, but doesn't have to
     */
    lateinit var activityComponent: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent = createActivityComponent((application as App).appComponent)
    }

    abstract fun createActivityComponent(appComponent: AppComponent): T
}
package com.codefactorypdabrowski.puredi.feature.one

import android.app.Activity
import com.codefactorypdabrowski.puredi.di.Provider
import com.codefactorypdabrowski.puredi.di.activity.ActivityModule
import com.codefactorypdabrowski.puredi.di.activity.ActivityComponent
import com.codefactorypdabrowski.puredi.di.app.AppComponent

/**
 * OneActivity component
 */
class OneComponent(
    appComponent: AppComponent,
    activity: Activity
) : ActivityComponent(appComponent, ActivityModule(activity)) {

    val oneUseCase: Provider<OneUseCase> = object : Provider<OneUseCase> { // if we need lazy init
        override fun get(): OneUseCase {
            return OneUseCase(appComponent.repositoryOne)
        }
    }
}

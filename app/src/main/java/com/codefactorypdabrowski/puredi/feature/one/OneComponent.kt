package com.codefactorypdabrowski.puredi.feature.one

import com.codefactorypdabrowski.puredi.activity.BaseActivity
import com.codefactorypdabrowski.puredi.basedi.Provider
import com.codefactorypdabrowski.puredi.basedi.activity.ActivityModule
import com.codefactorypdabrowski.puredi.basedi.activity.BaseActivityComponent
import com.codefactorypdabrowski.puredi.basedi.app.AppComponent

/**
 * OneActivity component
 */
class OneComponent(
    appComponent: AppComponent,
    baseActivity: BaseActivity
) : BaseActivityComponent(appComponent, ActivityModule(baseActivity)) {

    val oneUseCase: Provider<OneUseCase> = object : Provider<OneUseCase> { // if we need lazy init
        override fun get(): OneUseCase {
            return OneUseCase(appComponent.repositoryOne)
        }
    }
}
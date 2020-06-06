package com.codefactorypdabrowski.puredi.feature.one

import android.os.Bundle
import com.codefactorypdabrowski.puredi.R
import com.codefactorypdabrowski.puredi.activity.BaseDiActivity
import com.codefactorypdabrowski.puredi.basedi.app.AppComponent

class OneActivity : BaseDiActivity<OneComponent>() {

    lateinit var useCase: OneUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        OneActivityMemberInjector().injectMembers(this)

        useCase.execute()
    }

    override fun createActivityComponent(appComponent: AppComponent): OneComponent =
        OneComponent(appComponent, this)
}
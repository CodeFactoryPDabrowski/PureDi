package com.codefactorypdabrowski.puredi.feature.one

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.codefactorypdabrowski.puredi.R
import com.codefactorypdabrowski.puredi.app.App

class OneActivity : ComponentActivity() {

    lateinit var useCase: OneUseCase
    lateinit var activityComponent: OneComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        activityComponent = OneComponent(
            appComponent = (application as App).appComponent,
            activity = this,
        )

        OneActivityMemberInjector().injectMembers(this)

        useCase.execute()
    }
}

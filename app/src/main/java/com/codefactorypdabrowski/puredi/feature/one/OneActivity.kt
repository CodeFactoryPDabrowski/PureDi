package com.codefactorypdabrowski.puredi.feature.one

import android.os.Bundle
import com.codefactorypdabrowski.puredi.R
import com.codefactorypdabrowski.puredi.activity.BaseActivity

class OneActivity : BaseActivity() {
    
    lateinit var useCase: OneUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)
        OneActivityMemberInjector().injectMembers(this)

        useCase.execute()
    }
}
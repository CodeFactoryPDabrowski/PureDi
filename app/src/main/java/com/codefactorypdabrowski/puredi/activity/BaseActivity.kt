package com.codefactorypdabrowski.puredi.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codefactorypdabrowski.puredi.app.App
import com.codefactorypdabrowski.puredi.basedi.app.AppComponent

abstract class BaseActivity : AppCompatActivity() {

    lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent = (application as App).appComponent
    }

}
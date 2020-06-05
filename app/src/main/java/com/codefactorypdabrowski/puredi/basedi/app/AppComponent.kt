package com.codefactorypdabrowski.puredi.basedi.app

import com.codefactorypdabrowski.puredi.dataone.DataOneModule

class AppComponent(private val appModule: AppModule) {
    private val dataOneModule = DataOneModule()//modules

    val repositoryOne = dataOneModule.repositoryOne
}
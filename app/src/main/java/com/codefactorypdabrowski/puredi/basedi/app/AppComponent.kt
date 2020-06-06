package com.codefactorypdabrowski.puredi.basedi.app

import com.codefactorypdabrowski.puredi.dataone.DataOneModule

/**
 * Holds modules that creates singleton objects(objects that lives as long as application is alive)
 */
class AppComponent(private val appModule: AppModule) {
    private val dataOneModule = DataOneModule()//modules

    val repositoryOne = dataOneModule.repositoryOne
}
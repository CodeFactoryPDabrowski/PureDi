package com.codefactorypdabrowski.puredi.di.app

import com.codefactorypdabrowski.puredi.dataone.DataOneModule

/**
 * Holds modules that creates singleton objects(objects that lives as long as application is alive)
 */
class AppComponent(
    private val appModule: AppModule,
    dataOneModule: DataOneModule = DataOneModule() //Other modules
) {
    val repositoryOne = dataOneModule.repositoryOne
}

package com.codefactorypdabrowski.puredi.dataone

class DataOneModule {
    private val dataSourceOne = DataSourceOne()
    private val dataSourceTwo = DataSourceTwo()

    val repositoryOne = RepositoryOne(dataSourceOne, dataSourceTwo)
}
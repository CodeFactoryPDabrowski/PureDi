package com.codefactorypdabrowski.puredi.dataone

class DataOneModule {

    val repositoryOne: RepositoryOne by lazy {
        val dataSourceOne = DataSourceOne()
        val dataSourceTwo = DataSourceTwo()
        RepositoryOne(dataSourceOne, dataSourceTwo)
    }// In Java use DoubleCheck -> https://github.com/google/dagger/blob/master/java/dagger/internal/DoubleCheck.java
}
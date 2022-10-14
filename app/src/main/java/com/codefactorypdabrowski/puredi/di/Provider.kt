package com.codefactorypdabrowski.puredi.di

/**
 * Provides dependencies needed for clients
 */
interface Provider<T> {
    fun get(): T
}

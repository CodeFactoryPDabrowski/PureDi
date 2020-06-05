package com.codefactorypdabrowski.puredi.basedi

/**
 * Provides dependencies needed for clients
 */
interface Provider<T> {
    fun get(): T
}
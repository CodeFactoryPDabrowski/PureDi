package com.codefactorypdabrowski.puredi.feature.one

import com.codefactorypdabrowski.puredi.di.activity.MembersInjector

/**
 * Example of injector for OneActivity
 */
class OneActivityMemberInjector : MembersInjector<OneActivity> {

    override fun injectMembers(instance: OneActivity) {
        instance.useCase = instance.activityComponent.oneUseCase.get()
    }
}

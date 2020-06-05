package com.codefactorypdabrowski.puredi.feature.one

import com.codefactorypdabrowski.puredi.basedi.activity.MembersInjector

class OneActivityMemberInjector : MembersInjector<OneActivity> {

    override fun injectMembers(instance: OneActivity) {
        val activityComponent = OneComponent(instance.appComponent, instance)
        instance.useCase = activityComponent.oneUseCase.get()
    }
}
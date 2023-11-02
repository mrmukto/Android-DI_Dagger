package com.dmabd.daggertest

import dagger.Component

@Component(modules = [UseRepoModule::class, EmailModule::class])
interface UserRegisterComponent {
    /*fun getUserRegisterService(): UserRegisterService
    fun getEmailService() : EmailService
    fun getUserRepo() : UserRepo*/

    fun inject(mainActivity: MainActivity)

}
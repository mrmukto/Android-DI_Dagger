package com.dmabd.daggertest

import javax.inject.Inject

class UserRegisterService @Inject constructor(
    private val userRepo: UserRepo,
    private val emailService: EmailService,
    private val notificationService: NotificationService
) {
    fun getRegister(email: String, password:String){
        userRepo.saveUser("mukto@gmail.com","1234")
        notificationService.send("mamun@gmail.com","mukto@gmail.com","This is test")
    }

}
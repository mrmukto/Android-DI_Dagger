package com.dmabd.daggertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    //field
    @Inject
     lateinit var userRegisterService :UserRegisterService
    @Inject
     lateinit var emailService: EmailService

    @Inject
     lateinit var userRepo :UserRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegisterComponent.builder().build()
        component.inject(this)

        /*val userRegisterService = component.getUserRegisterService()
        val emailService = component.getEmailService()
        val userRepo = component.getUserRepo()*/

        userRegisterService.getRegister("mukto@gmail.com","1234")
        emailService.send("","","")
        userRepo.saveUser("m@gmail.com","1`23")

    }
}
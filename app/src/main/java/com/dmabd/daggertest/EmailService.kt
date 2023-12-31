package com.dmabd.daggertest

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,from:String,body:String?)

}
class EmailService @Inject constructor():NotificationService{
    override fun send(to:String, from:String, body:String?){
        Log.d("TAG", "send: ")
    }

}

class MessageSend :NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "send")
    }
}
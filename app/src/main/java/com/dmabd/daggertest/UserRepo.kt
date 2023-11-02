package com.dmabd.daggertest

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepo{
    fun saveUser(email: String, password: String)
}
class SQLRepo @Inject constructor():UserRepo{
    override fun saveUser(email: String, password: String){
        Log.d(TAG, "saveUser: ")
    }

}

class FireBaseRepo :UserRepo{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: in firebase")
    }

}
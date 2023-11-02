package com.dmabd.daggertest

import dagger.Module
import dagger.Provides

@Module
class EmailModule {
    @Provides
    fun getMessageSend(): NotificationService{
        return MessageSend()
    }
}
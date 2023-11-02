package com.dmabd.daggertest

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UseRepoModule {

    @Binds
    abstract fun  getSQLRepo(sqlRepo: SQLRepo):UserRepo
}
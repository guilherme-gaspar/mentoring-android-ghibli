package com.mentoria.mentoriaghibli

import android.app.Application
import com.mentoria.mentoriaghibli.di.ghibliModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(ghibliModules)
        }
    }
}
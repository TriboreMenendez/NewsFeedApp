package com.example.mynewsfeed

import android.app.Application
import com.example.mynewsfeed.di.appModule
import com.example.mynewsfeed.di.dataBaseModule
import com.example.mynewsfeed.features.bookmarks_screen.di.bookmarksModule
import com.example.mynewsfeed.features.news_screen.di.mainScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(appModule, mainScreenModule, dataBaseModule, bookmarksModule)
        }
    }
}
package com.example.mynewsfeed.di

import androidx.room.Room
import com.example.mynewsfeed.AppDataBase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

const val DATA_BASE = "DATA_BASE"
val appModule = module {
//    single<OkHttpClient> {
//        OkHttpClient.Builder()
//            .build()
//    }
}

val dataBaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDataBase::class.java, DATA_BASE)
            .fallbackToDestructiveMigration()
            .build()
    }

    single {
        get<AppDataBase>().bookmarksDAO()
    }
}
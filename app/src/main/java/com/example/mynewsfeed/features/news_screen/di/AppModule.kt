package com.example.mynewsfeed.features.news_screen.di

import com.example.mynewsfeed.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.mynewsfeed.features.news_screen.data.api.NewsApi
import com.example.mynewsfeed.features.news_screen.data.api.NewsRemoteSource
import com.example.mynewsfeed.features.news_screen.data.api.NewsRepository
import com.example.mynewsfeed.features.news_screen.data.api.NewsRepositoryImpl
import com.example.mynewsfeed.features.news_screen.domain.NewsInteractor
import com.example.mynewsfeed.features.news_screen.ui.MainScreenViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://newsapi.org/"

val mainScreenModule = module {
    single<OkHttpClient> {
        OkHttpClient.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<NewsApi> {
        get<Retrofit>().create(NewsApi::class.java)
    }

    single<NewsRemoteSource> {
        NewsRemoteSource(get<NewsApi>())
    }

    single<NewsRepository> {
        NewsRepositoryImpl(get<NewsRemoteSource>())
    }

    single<NewsInteractor> {
        NewsInteractor(get<NewsRepository>())
    }

    viewModel {
        MainScreenViewModel(get<NewsInteractor>(), get<BookmarkInteractor>())
    }
}
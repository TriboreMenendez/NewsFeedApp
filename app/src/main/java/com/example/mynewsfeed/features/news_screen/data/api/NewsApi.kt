package com.example.mynewsfeed.features.news_screen.data.api

import com.example.mynewsfeed.features.news_screen.data.api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=ru&apiKey=API_KEY

interface NewsApi {
    @GET("v2/top-headlines")

    suspend fun getNews(
        @Query("apiKey") apiKey: String = "66147346f2a941369d369f9f9eeff6d9",
        @Query("country") country: String = "ru"
//        @Query("q") searchKey: String?
    ): NewsModel
}
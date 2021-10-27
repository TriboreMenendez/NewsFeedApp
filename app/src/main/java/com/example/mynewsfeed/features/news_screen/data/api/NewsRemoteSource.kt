package com.example.mynewsfeed.features.news_screen.data.api

import com.example.mynewsfeed.features.news_screen.data.api.model.NewsModel

class NewsRemoteSource(private val api: NewsApi) {
    suspend fun getNews(): NewsModel = api.getNews()
}
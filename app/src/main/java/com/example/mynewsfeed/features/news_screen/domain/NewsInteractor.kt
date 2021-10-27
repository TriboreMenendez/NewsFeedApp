package com.example.mynewsfeed.features.news_screen.domain

import com.example.mynewsfeed.base.attempt
import com.example.mynewsfeed.features.news_screen.data.api.NewsRepository

class NewsInteractor(private val repository: NewsRepository) {
    suspend fun getNews() = attempt { repository.getNews() }
}
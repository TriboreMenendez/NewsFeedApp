package com.example.mynewsfeed.features.news_screen.data.api

import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

interface NewsRepository {
    suspend fun getNews(): List<NewsDomainModel>
}
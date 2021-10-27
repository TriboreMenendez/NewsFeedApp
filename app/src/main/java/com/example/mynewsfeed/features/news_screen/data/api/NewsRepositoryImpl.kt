package com.example.mynewsfeed.features.news_screen.data.api

import com.example.mynewsfeed.features.news_screen.data.toDomain
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

class NewsRepositoryImpl(private val source: NewsRemoteSource) : NewsRepository {
    override suspend fun getNews(): List<NewsDomainModel> =
        source.getNews().articles.map { it.toDomain()
        }
}
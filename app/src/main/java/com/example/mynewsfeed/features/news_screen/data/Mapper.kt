package com.example.mynewsfeed.features.news_screen.data

import com.example.mynewsfeed.features.news_screen.data.api.model.ArticleModel
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel


fun ArticleModel.toDomain() = NewsDomainModel(
    author = this.author ?: "null",
    title = this.title,
    description = this.description ?: "null",
    url = this.url,
    publishedAt = this.publishedAt
    //this.urlToImage
)
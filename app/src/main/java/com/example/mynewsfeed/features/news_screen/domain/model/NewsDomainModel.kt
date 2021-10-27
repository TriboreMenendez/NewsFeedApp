package com.example.mynewsfeed.features.news_screen.domain.model

data class NewsDomainModel (
    //val source: NewsSourceDomainModel,
    //val urlToImage: String,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val publishedAt: String
)
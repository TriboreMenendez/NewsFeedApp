package com.example.mynewsfeed.features.news_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("totalResult") val totalResult: String,
    @SerializedName("articles") val articles: List<ArticleModel>
)
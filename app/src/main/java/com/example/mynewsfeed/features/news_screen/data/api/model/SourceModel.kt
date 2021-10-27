package com.example.mynewsfeed.features.news_screen.data.api.model

import com.google.gson.annotations.SerializedName

data class SourceModel(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)

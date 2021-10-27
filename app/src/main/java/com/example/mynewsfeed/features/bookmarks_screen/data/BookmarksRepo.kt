package com.example.mynewsfeed.features.bookmarks_screen.data

import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

interface BookmarksRepo {
    suspend fun create(newsDomainModel: NewsDomainModel)
    suspend fun read(): List<NewsDomainModel>
    suspend fun update(newsDomainModel: NewsDomainModel)
    suspend fun delete(newsDomainModel: NewsDomainModel)
}
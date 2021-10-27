package com.example.mynewsfeed.features.bookmarks_screen.domain

import com.example.mynewsfeed.features.bookmarks_screen.data.BookmarksRepo
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

class BookmarkInteractor (private val repo: BookmarksRepo) {
    suspend fun create(newsDomainModel: NewsDomainModel) = repo.create(newsDomainModel)
    suspend fun read() : List<NewsDomainModel> = repo.read()
    suspend fun update(newsDomainModel: NewsDomainModel) = repo.update(newsDomainModel)
    suspend fun delete(newsDomainModel: NewsDomainModel) = repo.delete(newsDomainModel)
}
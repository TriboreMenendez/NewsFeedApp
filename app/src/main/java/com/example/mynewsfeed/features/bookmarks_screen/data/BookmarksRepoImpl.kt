package com.example.mynewsfeed.features.bookmarks_screen.data

import com.example.mynewsfeed.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

class BookmarksRepoImpl(private val bookmarkDAO: BookmarkDAO) : BookmarksRepo {
    override suspend fun create(newsDomainModel: NewsDomainModel) {
        bookmarkDAO.create(newsDomainModel.toEntityModel())
    }

    override suspend fun read(): List<NewsDomainModel> {
        return bookmarkDAO.read().map { it.toDomainModel() }
    }

    override suspend fun update(newsDomainModel: NewsDomainModel) {
        bookmarkDAO.update(newsDomainModel.toEntityModel())
    }

    override suspend fun delete(newsDomainModel: NewsDomainModel) {
        bookmarkDAO.delete(newsDomainModel.toEntityModel())
    }
}
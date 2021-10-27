package com.example.mynewsfeed.features.bookmarks_screen.data

import com.example.mynewsfeed.features.bookmarks_screen.data.local.BookmarksEntity
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

fun NewsDomainModel.toEntityModel() = BookmarksEntity(
    //urlToImage = urlToImage,
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt
)

fun BookmarksEntity.toDomainModel() = NewsDomainModel(
    //urlToImage = urlToImage,
    url = url,
    author = author,
    title = title,
    description = description,
    publishedAt = publishedAt

)
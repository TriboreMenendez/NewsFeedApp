package com.example.mynewsfeed

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynewsfeed.features.bookmarks_screen.data.local.BookmarkDAO
import com.example.mynewsfeed.features.bookmarks_screen.data.local.BookmarksEntity

@Database(entities = [BookmarksEntity::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun bookmarksDAO() : BookmarkDAO
}
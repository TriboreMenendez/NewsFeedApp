package com.example.mynewsfeed.features.bookmarks_screen.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mynewsfeed.features.bookmarks_screen.data.local.BookmarksEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class BookmarksEntity(
    @PrimaryKey
    @ColumnInfo(name = "url")
    val url: String,
    @ColumnInfo(name = "author")
    val author: String,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "publishedAt")
    val publishedAt: String,
    //@ColumnInfo(name = "urlToImage")
    //val urlToImage: String
) {
    companion object {
        const val TABLE_NAME = "BOOKMARKS_TABLE"
    }
}

//@Entity(tableName = TABLE_NAME)
//data class BookmarksEntity(
//    @PrimaryKey
//    @ColumnInfo(name = "url")
//    val url: String,
//    @ColumnInfo(name = "author")
//    val author: String,
//    @ColumnInfo(name = "title")
//    val title: String,
//    @ColumnInfo(name = "description")
//    val description: String,
//    @ColumnInfo(name = "urlToImage")
//    val urlToImage: String,
//    @ColumnInfo(name = "publishedAt")
//    val publishedAt: String
//) {
//    companion object {
//        const val TABLE_NAME = "BOOKMARKS_TABLE"
//    }
//}
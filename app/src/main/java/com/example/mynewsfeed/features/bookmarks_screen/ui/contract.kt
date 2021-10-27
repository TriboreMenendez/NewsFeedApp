package com.example.mynewsfeed.features.bookmarks_screen.ui

import com.example.mynewsfeed.base.Event
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

data class ViewState(
    val newsList: List<NewsDomainModel>
)

sealed class DataEvent: Event {
    object RefreshDataBase: DataEvent()
}
package com.example.mynewsfeed.features.news_screen.ui

import com.example.mynewsfeed.base.Event
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

/* С помощью контракта мы заранее должны спроектировать все действия
пользователя относительно нашего экрана (UIEvent), а также все действия,
которые будут происходить без пользователя (DataEvent) */

data class ViewState(
    val newsList: List<NewsDomainModel>,
    val errorMessage: String?,
    val isLoading: Boolean
)

sealed class UIEvent() : Event {
    data class OnArticleClick(val newsDomainModel: NewsDomainModel): UIEvent()
}

sealed class DataEvent() : Event {
    // Симв. о том, что происходит (команда)
    object OnLoadData: DataEvent()
    data class SuccessNewsRequest(val newsList: List<NewsDomainModel>) : DataEvent()
    data class ErrorNewsRequest(val error: String) : DataEvent()
}
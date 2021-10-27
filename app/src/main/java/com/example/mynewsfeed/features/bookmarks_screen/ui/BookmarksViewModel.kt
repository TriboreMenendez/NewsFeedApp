package com.example.mynewsfeed.features.bookmarks_screen.ui

import com.example.mynewsfeed.base.BaseViewModel
import com.example.mynewsfeed.base.Event
import com.example.mynewsfeed.features.bookmarks_screen.domain.BookmarkInteractor

class BookmarksViewModel(private val bookmarkInteractor: BookmarkInteractor) :
    BaseViewModel<ViewState>() {

    init {
        processDataEvent(DataEvent.RefreshDataBase)
    }

    override fun initialViewState(): ViewState = ViewState(emptyList())

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when(event) {
            is DataEvent.RefreshDataBase -> {
                val newArticleList = bookmarkInteractor.read()
                return previousState.copy(newsList = newArticleList)
            }
            else -> return null
        }
    }

}
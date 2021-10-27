package com.example.mynewsfeed.features.news_screen.ui

import com.example.mynewsfeed.base.BaseViewModel
import com.example.mynewsfeed.base.Event
import com.example.mynewsfeed.features.bookmarks_screen.domain.BookmarkInteractor
import com.example.mynewsfeed.features.news_screen.domain.NewsInteractor

class MainScreenViewModel(
    private val newsInteractor: NewsInteractor,
    private val bookmarkInteractor: BookmarkInteractor
) : BaseViewModel<ViewState>() {
    init {
        processDataEvent(DataEvent.OnLoadData)
    }

    override fun initialViewState(): ViewState {
        return ViewState(emptyList(), null, true)
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        when (event) {
            is UIEvent.OnArticleClick -> {
                bookmarkInteractor.create(event.newsDomainModel)
            }
            is DataEvent.OnLoadData -> {
                newsInteractor.getNews().fold(
                    onSuccess = { processDataEvent(DataEvent.SuccessNewsRequest(it)) },
                    onError = {
                        processDataEvent(
                            DataEvent.ErrorNewsRequest(
                                it.localizedMessage ?: ""
                            )
                        )
                    }
                )
            }
            is DataEvent.SuccessNewsRequest -> {
                return previousState.copy(newsList = event.newsList, isLoading = false)
            }
            is DataEvent.ErrorNewsRequest -> {
            }
        }
        return null
    }
}
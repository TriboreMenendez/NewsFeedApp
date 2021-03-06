package com.example.mynewsfeed.features.bookmarks_screen.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.mynewsfeed.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class BookmarksScreenFragment: Fragment(R.layout.fragment_bookmarks) {
    private val viewModel by viewModel<BookmarksViewModel>()

    companion object {
        fun newInstance() : BookmarksScreenFragment = BookmarksScreenFragment()
    }
    private lateinit var bookmarkTitle: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookmarkTitle = view.findViewById<TextView>(R.id.textView2)
        viewModel.viewState.observe(viewLifecycleOwner, Observer(::render))
    }

    private fun render(state: ViewState) {
        bookmarkTitle.text = state.newsList.toString()
    }
}
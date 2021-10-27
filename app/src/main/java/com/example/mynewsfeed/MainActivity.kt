package com.example.mynewsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.mynewsfeed.features.bookmarks_screen.ui.BookmarksScreenFragment
import com.example.mynewsfeed.features.news_screen.ui.MainScreenFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // commit обязателен

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.newsMenu -> setFragment(MainScreenFragment())
                R.id.bookmarkMenu -> setFragment(BookmarksScreenFragment.newInstance())
            }
            true
        }
        bottomNavigationView.selectedItemId = R.id.newsMenu
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment).commit()
    }
}
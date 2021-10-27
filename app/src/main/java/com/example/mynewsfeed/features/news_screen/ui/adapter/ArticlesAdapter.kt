package com.example.mynewsfeed.features.news_screen.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynewsfeed.R
import com.example.mynewsfeed.features.news_screen.domain.model.NewsDomainModel

class ArticlesAdapter(
    private var newsModels: List<NewsDomainModel>,
    private val onItemClick: (newsModel: NewsDomainModel) -> Unit
) :
    RecyclerView.Adapter<ArticlesAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView

        init {
            this.title = view.findViewById<TextView>(R.id.textView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = newsModels[position].title
        holder.itemView.setOnClickListener { onItemClick(newsModels[position]) }
    }

    override fun getItemCount(): Int {
        return newsModels.size
    }

    fun updateArticles(updatedNewsModels: List<NewsDomainModel>) {
        newsModels = updatedNewsModels
        notifyDataSetChanged()
    }
}
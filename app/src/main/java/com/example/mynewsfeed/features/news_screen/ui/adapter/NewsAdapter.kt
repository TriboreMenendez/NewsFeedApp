package com.example.mynewsfeed.features.news_screen.ui.adapter

class NewsAdapter()
//    private var news: List<ArticleDomainModel>,
//    private val onItemClick: (article: ArticleDomainModel) -> Unit
//) :
//    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val context = parent.context
//        val inflater = LayoutInflater.from(context)
//        val citiesView = inflater.inflate(R.layout.article_list_items, parent, false)
//        return ViewHolder(citiesView)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val article = news[position]
//        holder.bind(article)
//    }
//
//    override fun getItemCount(): Int = news.size
//
//    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val image: ImageView = itemView.findViewById(R.id.imageNews)
//        private val title: TextView = itemView.findViewById(R.id.tvTitle)
//        private val description: TextView = itemView.findViewById(R.id.tvDescription)
//        private val publishedAt: TextView = itemView.findViewById(R.id.tvDate)
//
//        fun bind(article: ArticleDomainModel) {
//            val url = if (article.urlToImage != null) "${article.urlToImage}?w=360" else null
//            Glide.with(itemView)
//                .load(url)
//                .centerCrop()
//                .placeholder(R.drawable.ic_launcher_background)
//                .error(R.drawable.ic_launcher_background)
//                .fallback(R.drawable.ic_launcher_background)
//                .into(image)
//
//            title.text = article.title
//            description.text = article.description ?: ""
//
//            val parser = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
//            val formatter = SimpleDateFormat("dd.MM.yyyy HH:mm")
//            publishedAt.text = formatter.format(parser.parse(article.publishedAt) ?: "")
//
//            itemView.setOnClickListener {
//                onItemClick(article)
//            }
//        }
//    }
//
//    fun updateArticles(newArticles: List<ArticleDomainModel>) {
//        news = newArticles
//        notifyDataSetChanged()
//    }
//}
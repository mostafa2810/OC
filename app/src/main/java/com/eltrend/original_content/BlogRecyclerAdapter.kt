package com.eltrend.original_content


import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.eltrend.original_content.models.BlogPost
import kotlin.collections.ArrayList


class BlogRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{


    private val TAG: String = "AppDebug"

    private var items: List<BlogPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is BlogViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<BlogPost>){
        items = blogList
    }

    class BlogViewHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        init {

            itemView.setOnClickListener {

                when (position) {
                    0 -> {
                        itemView.context.startActivity(Intent(itemView.context, secound::class.java
                            )
                        )
                    }
                     1 -> {
                        itemView.context.startActivity(Intent(itemView.context, third::class.java
                            )
                        )
                    }
                     2 -> {
                        itemView.context.startActivity(Intent(itemView.context, forth::class.java
                            )
                        )
                    }
                    3 -> {
                        itemView.context.startActivity(Intent(itemView.context, fifth::class.java
                            )
                        )
                    }
                }
            }
        }
        val blog_image = itemView.blog_image
        val blog_title = itemView.blog_title
        val blog_author = itemView.blog_author

        fun bind(blogPost: BlogPost){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(blogPost.image)
                .into(blog_image)
            blog_title.setText(blogPost.title)
            blog_author.setText(blogPost.username)

        }

    }

}

package com.example.acsmobile.model.news

data class PostModel(
        val title:String,
        val content:String,
        val contentShort:String,
        val date:String,
        val author:String
)
fun NewsResponseModelItem.toPostModel() = PostModel(
        title = title.rendered,
        content = content.rendered,
        contentShort = excerpt.rendered,
        date = date,
        author = author.toString()
)

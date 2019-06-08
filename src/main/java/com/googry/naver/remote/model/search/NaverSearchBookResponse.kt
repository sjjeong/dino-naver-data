package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchBookEntity

data class NaverSearchBookResponse(
    @SerializedName("display")
    val display: Int,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("lastBuildDate")
    val lastBuildDate: String,
    @SerializedName("start")
    val start: Int,
    @SerializedName("total")
    val total: Int
) {
    data class Item(
        @SerializedName("author")
        val author: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("discount")
        val discount: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("isbn")
        val isbn: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("price")
        val price: String,
        @SerializedName("pubdate")
        val pubDate: String,
        @SerializedName("publisher")
        val publisher: String,
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchBookResponse.toData() =
    items.map {
        NaverSearchBookEntity(
            author = it.author,
            description = it.description,
            discount = it.discount,
            image = it.image,
            isbn = it.isbn,
            link = it.link,
            price = it.price,
            pubDate = it.pubDate,
            publisher = it.publisher,
            title = it.title
        )
    }
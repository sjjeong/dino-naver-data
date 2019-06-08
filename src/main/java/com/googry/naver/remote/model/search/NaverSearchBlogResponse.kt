package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchBlogEntity

data class NaverSearchBlogResponse(
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
        @SerializedName("bloggerlink")
        val bloggerLink: String,
        @SerializedName("bloggername")
        val bloggerName: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("postdate")
        val postdate: String,
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchBlogResponse.toData() =
    items.map {
        NaverSearchBlogEntity(
            bloggerLink = it.bloggerLink,
            bloggerName = it.bloggerName,
            description = it.description,
            link = it.link,
            postdate = it.postdate,
            title = it.title
        )
    }
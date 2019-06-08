package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchNewsEntity

data class NaverSearchNewsResponse(
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
        @SerializedName("description")
        val description: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("originallink")
        val originalLink: String,
        @SerializedName("pubDate")
        val pubDate: String,
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchNewsResponse.toData() =
    items.map {
        NaverSearchNewsEntity(
            description = it.description,
            link = it.link,
            originalLink = it.originalLink,
            pubDate = it.pubDate,
            title = it.title
        )
    }
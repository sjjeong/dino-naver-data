package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName

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
package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchWebkrEntity

data class NaverSearchWebkrResponse(
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
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchWebkrResponse.toData() =
    items.map {
        NaverSearchWebkrEntity(
            description = it.description,
            link = it.link,
            title = it.title
        )
    }
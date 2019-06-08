package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchMovieEntity

data class NaverSearchMovieResponse(
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
        @SerializedName("actor")
        val actor: String,
        @SerializedName("director")
        val director: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("pubDate")
        val pubDate: String,
        @SerializedName("subtitle")
        val subtitle: String,
        @SerializedName("title")
        val title: String,
        @SerializedName("userRating")
        val userRating: String
    )
}

fun NaverSearchMovieResponse.toData() =
    items.map {
        NaverSearchMovieEntity(
            actor = it.actor,
            director = it.director,
            image = it.image,
            link = it.link,
            pubDate = it.pubDate,
            subtitle = it.subtitle,
            title = it.title,
            userRating = it.userRating
        )
    }
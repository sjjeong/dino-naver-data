package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName

data class NaverSearchCafearticleResponse(
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
        @SerializedName("cafename")
        val cafeName: String,
        @SerializedName("cafeurl")
        val cafeUrl: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("title")
        val title: String
    )
}
package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName

data class NaverSearchImageResponse(
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
        @SerializedName("link")
        val link: String,
        @SerializedName("sizeheight")
        val sizeHeight: String,
        @SerializedName("sizewidth")
        val sizeWidth: String,
        @SerializedName("thumbnail")
        val thumbnail: String,
        @SerializedName("title")
        val title: String
    )
}
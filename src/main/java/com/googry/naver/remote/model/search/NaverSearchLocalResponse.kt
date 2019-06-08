package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchLocalEntity

data class NaverSearchLocalResponse(
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
        @SerializedName("address")
        val address: String,
        @SerializedName("category")
        val category: String,
        @SerializedName("description")
        val description: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("mapx")
        val mapX: String,
        @SerializedName("mapy")
        val mapY: String,
        @SerializedName("roadAddress")
        val roadAddress: String,
        @SerializedName("telephone")
        val telephone: String,
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchLocalResponse.toData() =
    items.map {
        NaverSearchLocalEntity(
            address = it.address,
            category = it.category,
            description = it.description,
            link = it.link,
            mapX = it.mapX,
            mapY = it.mapY,
            roadAddress = it.roadAddress,
            telephone = it.telephone,
            title = it.title
        )
    }
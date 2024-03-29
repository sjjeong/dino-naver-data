package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchShopEntity

data class NaverSearchShopResponse(
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
        @SerializedName("hprice")
        val hPrice: String,
        @SerializedName("image")
        val image: String,
        @SerializedName("link")
        val link: String,
        @SerializedName("lprice")
        val lPrice: String,
        @SerializedName("mallName")
        val mallName: String,
        @SerializedName("productId")
        val productId: String,
        @SerializedName("productType")
        val productType: String,
        @SerializedName("title")
        val title: String
    )
}

fun NaverSearchShopResponse.toData() =
    items.map {
        NaverSearchShopEntity(
            hPrice = it.hPrice,
            image = it.image,
            link = it.link,
            lPrice = it.lPrice,
            mallName = it.mallName,
            productId = it.productId,
            productType = it.productType,
            title = it.title
        )
    }
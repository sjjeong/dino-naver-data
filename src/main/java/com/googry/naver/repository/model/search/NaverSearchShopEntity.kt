package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchShop

data class NaverSearchShopEntity(
    val hPrice: String,
    val image: String,
    val link: String,
    val lPrice: String,
    val mallName: String,
    val productId: String,
    val productType: String,
    val title: String
)

fun NaverSearchShopEntity.toDomain() =
    NaverSearchShop(
        hPrice = hPrice,
        image = image,
        link = link,
        lPrice = lPrice,
        mallName = mallName,
        productId = productId,
        productType = productType,
        title = title
    )
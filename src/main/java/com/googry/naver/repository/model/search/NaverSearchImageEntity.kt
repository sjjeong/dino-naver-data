package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchImage

data class NaverSearchImageEntity(
    val link: String,
    val sizeHeight: String,
    val sizeWidth: String,
    val thumbnail: String,
    val title: String
)

fun NaverSearchImageEntity.toDomain() =
    NaverSearchImage(
        link = link,
        sizeHeight = sizeHeight,
        sizeWidth = sizeWidth,
        thumbnail = thumbnail,
        title = title
    )
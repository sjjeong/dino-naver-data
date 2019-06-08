package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchLocal

data class NaverSearchLocalEntity(
    val address: String,
    val category: String,
    val description: String,
    val link: String,
    val mapX: String,
    val mapY: String,
    val roadAddress: String,
    val telephone: String,
    val title: String
)

fun NaverSearchLocalEntity.toDomain() =
    NaverSearchLocal(
        address = address,
        category = category,
        description = description,
        link = link,
        mapX = mapX,
        mapY = mapY,
        roadAddress = roadAddress,
        telephone = telephone,
        title = title
    )
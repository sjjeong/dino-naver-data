package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchCafearticle

data class NaverSearchCafearticleEntity(
    val cafeName: String,
    val cafeUrl: String,
    val description: String,
    val link: String,
    val title: String
)

fun NaverSearchCafearticleEntity.toDomain() =
    NaverSearchCafearticle(
        cafeName = cafeName,
        cafeUrl = cafeUrl,
        description = description,
        link = link,
        title = title
    )
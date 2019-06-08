package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchWebkr

data class NaverSearchWebkrEntity(
    val description: String,
    val link: String,
    val title: String
)

fun NaverSearchWebkrEntity.toDomain() =
    NaverSearchWebkr(
        description = description,
        link = link,
        title = title
    )
package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchDoc

data class NaverSearchDocEntity(
    val description: String,
    val link: String,
    val title: String
)

fun NaverSearchDocEntity.toDomain() =
    NaverSearchDoc(
        description = description,
        link = link,
        title = title
    )
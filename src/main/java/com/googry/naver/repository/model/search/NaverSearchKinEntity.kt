package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchKin

data class NaverSearchKinEntity(
    val description: String,
    val link: String,
    val title: String
)

fun NaverSearchKinEntity.toDomain() =
    NaverSearchKin(
        description = description,
        link = link,
        title = title
    )
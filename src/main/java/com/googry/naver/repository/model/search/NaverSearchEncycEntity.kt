package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchEncyc

data class NaverSearchEncycEntity(
    val description: String,
    val link: String,
    val thumbnail: String,
    val title: String
)

fun NaverSearchEncycEntity.toDomain() =
    NaverSearchEncyc(
        description = description,
        link = link,
        thumbnail = thumbnail,
        title = title
    )
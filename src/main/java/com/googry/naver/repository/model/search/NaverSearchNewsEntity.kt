package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchNews

data class NaverSearchNewsEntity(
    val description: String,
    val link: String,
    val originalLink: String,
    val pubDate: String,
    val title: String
)

fun NaverSearchNewsEntity.toDomain() =
    NaverSearchNews(
        description = description,
        link = link,
        originalLink = originalLink,
        pubDate = pubDate,
        title = title
    )
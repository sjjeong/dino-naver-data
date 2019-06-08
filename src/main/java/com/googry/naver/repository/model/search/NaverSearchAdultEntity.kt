package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchAdult

data class NaverSearchAdultEntity(
    val adult: String
)

fun NaverSearchAdultEntity.toDomain() =
    NaverSearchAdult(adult)
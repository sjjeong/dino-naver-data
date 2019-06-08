package com.googry.naver.repository.model.search

import com.googry.naver.domain.model.search.NaverSearchErrata

data class NaverSearchErrataEntity(
    val errata: String
)

fun NaverSearchErrataEntity.toDomain() =
    NaverSearchErrata(errata)
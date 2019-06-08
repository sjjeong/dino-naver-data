package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchErrataEntity

data class NaverSearchErrataResponse(
    @SerializedName("errata")
    val errata: String
)

fun NaverSearchErrataResponse.toData() =
    NaverSearchErrataEntity(errata)
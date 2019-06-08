package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName
import com.googry.naver.repository.model.search.NaverSearchAdultEntity

data class NaverSearchAdultResponse(
    @SerializedName("adult")
    val adult: String
)

fun NaverSearchAdultResponse.toData() =
    NaverSearchAdultEntity(adult)
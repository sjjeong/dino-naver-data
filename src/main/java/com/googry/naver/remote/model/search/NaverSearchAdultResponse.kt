package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName

data class NaverSearchAdultResponse(
    @SerializedName("adult")
    val adult: String
)
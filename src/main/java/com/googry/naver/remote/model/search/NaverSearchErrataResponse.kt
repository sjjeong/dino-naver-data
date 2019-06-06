package com.googry.naver.remote.model.search

import com.google.gson.annotations.SerializedName

data class NaverSearchErrataResponse(
    @SerializedName("errata")
    val errata: String
)
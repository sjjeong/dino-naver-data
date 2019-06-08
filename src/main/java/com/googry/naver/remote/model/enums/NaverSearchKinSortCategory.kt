package com.googry.naver.remote.model.enums

enum class NaverSearchKinSortCategory(
    private val value: String
) {
    SIM("sim"),
    DATE("date"),
    POINT("point");

    override fun toString() = value
}
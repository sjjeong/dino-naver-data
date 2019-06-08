package com.googry.naver.domain.model.enums

enum class NaverSearchKinSortCategory(
    private val value: String
) {
    SIM("sim"),
    DATE("date"),
    POINT("point");

    override fun toString() = value
}
package com.googry.naver.remote.model.enums

enum class NaverSearchSortCategory(
    private val value: String
) {
    SIM("sim"),
    DATE("date");

    override fun toString() = value
}
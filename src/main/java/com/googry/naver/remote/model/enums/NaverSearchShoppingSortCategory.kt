package com.googry.naver.remote.model.enums

enum class NaverSearchShoppingSortCategory(
    private val value: String
) {
    SIM("sim"),
    DATE("date"),
    ASC("asc"),
    DES("des");

    override fun toString() = value
}
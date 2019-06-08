package com.googry.naver.domain.model.enums

enum class NaverSearchCountryCategory(
    private val value: String
) {
    KOREA("KR"),
    JAPAN("JP"),
    USA("US"),
    HONGKONG("HK"),
    ENGLAND("GB"),
    FRANCE("FR"),
    OTHER("ETC");

    override fun toString() = value
}
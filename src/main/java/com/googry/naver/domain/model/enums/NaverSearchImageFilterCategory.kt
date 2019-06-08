package com.googry.naver.domain.model.enums

enum class NaverSearchImageFilterCategory(
    private val value: String
) {
    ALL("all"),
    LARGE("large"),
    MEDIUM("medium"),
    SMALL("small");

    override fun toString() = value
}
package com.googry.naver.domain.model.enums

enum class NaverSearchLocalCategory(
    private val value: String
) {

    RANDOM("random"),
    COMMENT("comment");

    override fun toString() = value
}
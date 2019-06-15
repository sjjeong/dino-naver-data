package com.googry.naver.domain.usecase

import androidx.annotation.IntRange
import com.googry.naver.domain.model.enums.NaverSearchImageFilterCategory
import com.googry.naver.domain.model.enums.NaverSearchLocalCategory
import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchImageUseCase(private val naverSearchRepository: NaverSearchRepository) {

    suspend operator fun invoke(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchLocalCategory = NaverSearchLocalCategory.RANDOM,
        filter: NaverSearchImageFilterCategory = NaverSearchImageFilterCategory.ALL
    ) =
        naverSearchRepository.getImage(clientId, clientSecret, query, display, start, sort, filter)
}
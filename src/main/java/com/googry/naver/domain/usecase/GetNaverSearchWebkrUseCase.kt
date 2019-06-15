package com.googry.naver.domain.usecase

import androidx.annotation.IntRange
import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchWebkrUseCase(private val naverSearchRepository: NaverSearchRepository) {

    suspend operator fun invoke(
        clientId: String,
        clientSecret: String,
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1
    ) =
        naverSearchRepository.getWebkr(clientId, clientSecret, query, display, start)
}
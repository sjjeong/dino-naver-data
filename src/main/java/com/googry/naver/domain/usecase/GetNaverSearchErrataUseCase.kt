package com.googry.naver.domain.usecase

import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchErrataUseCase(private val naverSearchRepository: NaverSearchRepository) {

    suspend operator fun invoke(
        query: String
    ) =
        naverSearchRepository.getErrata(query)
}
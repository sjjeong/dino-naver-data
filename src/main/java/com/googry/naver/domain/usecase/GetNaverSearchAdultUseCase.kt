package com.googry.naver.domain.usecase

import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchAdultUseCase(private val naverSearchRepository: NaverSearchRepository) {

    suspend operator fun invoke(
        clientId: String,
        clientSecret: String,
        query: String
    ) =
        naverSearchRepository.getAdult(clientId, clientSecret, query)
}
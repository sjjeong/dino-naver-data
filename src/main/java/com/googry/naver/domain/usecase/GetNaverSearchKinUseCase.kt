package com.googry.naver.domain.usecase

import androidx.annotation.IntRange
import com.googry.naver.domain.model.enums.NaverSearchKinSortCategory
import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchKinUseCase(private val naverSearchRepository: NaverSearchRepository) {

    suspend operator fun invoke(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchKinSortCategory = NaverSearchKinSortCategory.SIM
    ) =
        naverSearchRepository.getKin(query, display, start, sort)
}
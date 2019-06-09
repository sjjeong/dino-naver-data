package com.googry.naver.domain.usecase

import androidx.annotation.IntRange
import com.googry.naver.domain.model.enums.NaverSearchSortCategory
import com.googry.naver.domain.repository.NaverSearchRepository

class GetNaverSearchBlogUseCase(private val naverSearchRepository: NaverSearchRepository) {
    suspend operator fun invoke(
        query: String,
        @IntRange(from = 10, to = 100) display: Int = 10,
        @IntRange(from = 1, to = 1000) start: Int = 1,
        sort: NaverSearchSortCategory = NaverSearchSortCategory.SIM
    ) =
        naverSearchRepository.getBlog(query, display, start, sort)

}
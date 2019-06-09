package com.googry.naver.domain.di

import com.googry.naver.domain.usecase.*
import org.koin.dsl.module

val dinoNaverDomainModule = module {
    single { GetNaverSearchBlogUseCase(get()) }
    single { GetNaverSearchNewsUseCase(get()) }
    single { GetNaverSearchBookUseCase(get()) }
    single { GetNaverSearchAdultUseCase(get()) }
    single { GetNaverSearchEncycUseCase(get()) }
    single { GetNaverSearchMovieUseCase(get()) }
    single { GetNaverSearchCafearticleUseCase(get()) }
    single { GetNaverSearchKinUseCase(get()) }
    single { GetNaverSearchLocalUseCase(get()) }
    single { GetNaverSearchErrataUseCase(get()) }
    single { GetNaverSearchWebkrUseCase(get()) }
    single { GetNaverSearchImageUseCase(get()) }
    single { GetNaverSearchShopUseCase(get()) }
    single { GetNaverSearchDocUseCase(get()) }
}
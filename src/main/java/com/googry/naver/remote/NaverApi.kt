package com.googry.naver.remote

import com.googry.naver.remote.model.enums.*
import com.googry.naver.remote.model.search.*
import retrofit2.http.GET
import retrofit2.http.Query

interface NaverApi {

    // 블로그
    // https://developers.naver.com/docs/search/blog/
    @GET("v1/search/blog.json")
    suspend fun blog(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchSortCategory
    ): NaverSearchBlogResponse

    // 뉴스
    // https://developers.naver.com/docs/search/news/
    @GET("v1/search/news.json")
    suspend fun news(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchSortCategory
    ): NaverSearchNewsResponse

    // 책
    // https://developers.naver.com/docs/search/book/
    @GET("v1/search/book.json")
    suspend fun book(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchSortCategory,
        @Query("d_titl") dTitl: String,
        @Query("d_auth") dAuth: String,
        @Query("d_cont") dCont: String,
        @Query("d_isbn") dIsbn: String,
        @Query("d_publ") dPubl: String,
        @Query("d_dafr") dDafr: String,
        @Query("d_dato") dDato: String,
        @Query("d_catg") dCatg: String
    ): NaverSearchBookResponse

    // 성인 검색어 판별
    // https://developers.naver.com/docs/search/adult/
    @GET("v1/search/adult.json")
    suspend fun adult(
        @Query("query") query: String
    ): NaverSearchAdultResponse

    // 백과사전
    // https://developers.naver.com/docs/search/encyclopedia/
    @GET("v1/search/encyc.json")
    suspend fun encyc(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): NaverSearchEncycResponse

    // 영화
    // https://developers.naver.com/docs/search/movie/
    @GET("v1/search/movie.json")
    suspend fun movie(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("genre") genre: NaverSearchMovieCategory? = null,
        @Query("country") country: NaverSearchCountryCategory? = null,
        @Query("yearfrom") yearFrom: Int? = null,
        @Query("yearto") yearTo: Int? = null
    ): NaverSearchMovieResponse

    // 카페글
    // https://developers.naver.com/docs/search/cafearticle/
    @GET("v1/search/cafearticle.json")
    suspend fun cafearticle(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchSortCategory
    ): NaverSearchCafearticleResponse

    // 지식iN
    // https://developers.naver.com/docs/search/kin/
    @GET("v1/search/kin.json")
    suspend fun kin(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchKinSortCategory
    ): NaverSearchKinResponse

    // 지역
    // https://developers.naver.com/docs/search/local/
    @GET("v1/search/local.json")
    suspend fun local(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchLocalCategory
    ): NaverSearchLocalResponse

    // 오타변환
    // https://developers.naver.com/docs/search/errata/
    @GET("v1/search/errata.json")
    suspend fun errata(
        @Query("query") query: String
    ): NaverSearchErrataResponse

    // 웹문서
    // https://developers.naver.com/docs/search/web/
    @GET("v1/search/webkr.json")
    suspend fun webkr(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): NaverSearchWebkrResponse

    // 이미지
    // https://developers.naver.com/docs/search/image/
    @GET("v1/search/image")
    suspend fun image(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchLocalCategory,
        @Query("filter") filter: NaverSearchImageFilterCategory
    ): NaverSearchImageResponse

    // 쇼핑
    // https://developers.naver.com/docs/search/shopping/
    @GET("v1/search/shop.json")
    suspend fun shop(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int,
        @Query("sort") sort: NaverSearchShoppingSortCategory
    ): NaverSearchShopResponse

    // 전문자료
    // https://developers.naver.com/docs/search/doc/
    @GET("v1/search/doc.json")
    suspend fun doc(
        @Query("query") query: String,
        @Query("display") display: Int,
        @Query("start") start: Int
    ): NaverSearchDocResponse

}
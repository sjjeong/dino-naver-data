package com.googry.naver.remote.model.enums

enum class NaverSearchMovieCategory(
    private val value: String
) {
    DRAMA("1"),
    FANTASY("2"),
    WEST("3"),
    FEAR("4"),
    ROMANCE("5"),
    ADVENTURE("6"),
    THRILLER("7"),
    NOIR("8"),
    CULT("9"),
    DOCUMENTARY("10"),
    COMEDY("11"),
    FAMILY("12"),
    MYSTERY("13"),
    WAR("14"),
    ANIMATION("15"),
    CRIME("16"),
    MUSICAL("17"),
    SF("18"),
    ACTION20("19"),
    MARTIAL_ART("20"),
    EROTIC("21"),
    SUSPENSE("22"),
    NARRATIVE("23"),
    BLACK_COMEDY("24"),
    EXPERIMENT("25"),
    MOVIE_CARTOONS("26"),
    MOVIE_MUSIC("27"),
    MOVIE_PARODY_POSTER("28");

    override fun toString() = value
}
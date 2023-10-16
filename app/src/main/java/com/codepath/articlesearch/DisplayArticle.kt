package com.codepath.articlesearch

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class DisplayArticle(
    @SerialName("headline")
    val headline: String?,
    val abstract: String?,
    @SerialName("byline")
    val byline: String?,
    val mediaImageUrl: String?
) : java.io.Serializable

@Keep
@Serializable
data class HeadLine(
    @SerialName("main")
    val main: String?
)
@Keep
@Serializable
data class Byline(
    @SerialName("original")
    val original: String?
) : java.io.Serializable
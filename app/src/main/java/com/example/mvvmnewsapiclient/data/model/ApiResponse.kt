package com.example.mvvmnewsapiclient.data.model


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ApiResponse(
    @SerializedName("articles")
    @Expose
    val articles: List<Article>?,
    @SerializedName("status")
    @Expose
    val status: String?,
    @SerializedName("totalResults")
    @Expose
    val totalResults: Int?
)

data class Article(
    @SerializedName("author")
    @Expose
    val author: Any?,
    @SerializedName("content")
    @Expose
    val content: String?,
    @SerializedName("description")
    @Expose
    val description: String?,
    @SerializedName("publishedAt")
    @Expose
    val publishedAt: String?,
    @SerializedName("source")
    @Expose
    val source: Source?,
    @SerializedName("title")
    @Expose
    val title: String?,
    @SerializedName("url")
    @Expose
    val url: String?,
    @SerializedName("urlToImage")
    @Expose
    val urlToImage: String?
)

data class Source(
    @SerializedName("id")
    @Expose
    val id: String?,
    @SerializedName("name")
    @Expose
    val name: String?
)
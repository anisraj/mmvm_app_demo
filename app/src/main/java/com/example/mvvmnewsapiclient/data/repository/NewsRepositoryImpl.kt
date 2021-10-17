package com.example.mvvmnewsapiclient.data.repository

import com.example.mvvmnewsapiclient.data.model.ApiResponse
import com.example.mvvmnewsapiclient.data.model.Article
import com.example.mvvmnewsapiclient.data.repository.data_source.NewsRemoteDataSource
import com.example.mvvmnewsapiclient.data.util.Resource
import com.example.mvvmnewsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource
) : NewsRepository {
    override suspend fun getNewsHeadLines(): Resource<ApiResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadLines())
    }

    private fun responseToResource(response : Response<ApiResponse>)
    : Resource<ApiResponse> {
        if (response.isSuccessful) {
            response.body()?.let {
                return Resource.Success(it)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<ApiResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}
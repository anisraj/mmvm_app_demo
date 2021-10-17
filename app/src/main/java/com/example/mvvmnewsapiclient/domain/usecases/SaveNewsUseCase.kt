package com.example.mvvmnewsapiclient.domain.usecases

import com.example.mvvmnewsapiclient.data.model.Article
import com.example.mvvmnewsapiclient.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) {
        newsRepository.saveNews(article)
    }
}
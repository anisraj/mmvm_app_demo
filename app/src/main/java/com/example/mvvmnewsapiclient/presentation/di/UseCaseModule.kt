package com.example.mvvmnewsapiclient.presentation.di

import com.example.mvvmnewsapiclient.domain.repository.NewsRepository
import com.example.mvvmnewsapiclient.domain.usecases.GetNewsHeadlinesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun providesNewsHeadLinesUseCase(newsRepository: NewsRepository) : GetNewsHeadlinesUseCase {
        return GetNewsHeadlinesUseCase(newsRepository)
    }
}
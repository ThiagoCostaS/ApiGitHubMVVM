package com.example.apigithubmvvm.di

import com.example.apigithubmvvm.remote.network.ApiService
import com.example.apigithubmvvm.remote.network.GitHubServices
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @Provides
    @Singleton
    fun provideApi() : GitHubServices{
     return ApiService.initRetrofit(GitHubServices::class.java)
    }
}

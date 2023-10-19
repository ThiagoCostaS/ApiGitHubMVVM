package com.example.apigithubmvvm.di

import com.example.apigithubmvvm.data.repositories.Repository
import com.example.apigithubmvvm.data.repositories.RepositoryImplementation
import com.example.apigithubmvvm.remote.repository.GitHubDataSourceImplementation
import com.example.apigithubmvvm.remote.source.GitHubDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun provideDataSource(services: GitHubDataSourceImplementation) : GitHubDataSource
    @Singleton
    @Binds
    abstract fun provideRepository(repository: RepositoryImplementation): Repository

}
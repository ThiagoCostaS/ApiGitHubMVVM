package com.example.apigithubmvvm.remote.repository

import com.example.apigithubmvvm.domain.mapper.toDomain
import com.example.apigithubmvvm.domain.model.RepositoriesResponseDomain
import com.example.apigithubmvvm.domain.model.UserResponseDomain
import com.example.apigithubmvvm.extensions.getOrThrowDomainError
import com.example.apigithubmvvm.remote.network.GitHubServices
import com.example.apigithubmvvm.remote.source.GitHubDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GitHubDataSourceImplementation @Inject constructor(private val services: GitHubServices) : GitHubDataSource {
    override suspend fun getUser(name: String): Flow<UserResponseDomain> {
        return runCatching { services.getUserGitHub(name) }
            .getOrThrowDomainError()
            .toDomain()
    }

    override suspend fun getUserRepositories(name: String): Flow<RepositoriesResponseDomain> {
        return runCatching { services.getUserRepositories(name) }
            .getOrThrowDomainError()
            .toDomain()
    }
}
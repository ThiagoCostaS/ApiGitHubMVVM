package com.example.apigithubmvvm.data.repositories

import com.example.apigithubmvvm.domain.model.RepositoriesResponseDomain
import com.example.apigithubmvvm.domain.model.UserResponseDomain
import com.example.apigithubmvvm.remote.source.GitHubDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(private val source: GitHubDataSource) : Repository {
    override suspend fun getUser(name: String): Flow<UserResponseDomain> = source.getUser(name)

    override suspend fun getUserRepositories(name: String): Flow<RepositoriesResponseDomain> =
        source.getUserRepositories(name)
}
package com.example.apigithubmvvm.remote.source

import com.example.apigithubmvvm.domain.model.RepositoriesResponseDomain
import com.example.apigithubmvvm.domain.model.UserResponseDomain
import kotlinx.coroutines.flow.Flow

interface GitHubDataSource {

    suspend fun getUser(name: String): Flow<UserResponseDomain>

    suspend fun getUserRepositories(name: String): Flow<RepositoriesResponseDomain>
}
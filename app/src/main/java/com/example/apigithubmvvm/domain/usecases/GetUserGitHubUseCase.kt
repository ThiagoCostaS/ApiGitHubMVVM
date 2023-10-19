package com.example.apigithubmvvm.domain.usecases

import com.example.apigithubmvvm.data.repositories.Repository
import com.example.apigithubmvvm.domain.model.UserResponseDomain
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUserGitHubUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(name: String): Flow<UserResponseDomain> =
        repository.getUser(name)

}
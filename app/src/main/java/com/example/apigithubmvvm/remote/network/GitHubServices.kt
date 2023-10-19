package com.example.apigithubmvvm.remote.network

import com.example.apigithubmvvm.remote.model.RepositoriesResponse
import com.example.apigithubmvvm.remote.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubServices {

    @GET("users/{username}")
    suspend fun getUserGitHub(@Path("username") name: String): UserResponse

    @GET("users/{username}/repos")
    suspend fun getUserRepositories(@Path("username") name: String): RepositoriesResponse
}
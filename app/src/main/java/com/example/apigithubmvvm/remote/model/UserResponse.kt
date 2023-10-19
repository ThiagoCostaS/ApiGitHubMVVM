package com.example.apigithubmvvm.remote.model

data class UserResponse(
    val avatarUrl: String?,
    val bio: String?,
    val createdAt: String,
    val followers: Int,
    val following: Int,
    val location: String?,
    val login: String,
    val name: String?,
    val updatedAt: String,
)
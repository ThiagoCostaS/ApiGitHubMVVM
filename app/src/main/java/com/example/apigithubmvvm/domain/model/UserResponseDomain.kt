package com.example.apigithubmvvm.domain.model

data class UserResponseDomain(
    val avatar_url: String?,
    val bio: String?,
    val created_at: String,
    val followers: Int,
    val following: Int,
    val location: String?,
    val login: String,
    val name: String?,
    val updated_at: String,
)

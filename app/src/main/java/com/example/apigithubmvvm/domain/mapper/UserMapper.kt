package com.example.apigithubmvvm.domain.mapper

import com.example.apigithubmvvm.domain.model.UserResponseDomain
import com.example.apigithubmvvm.remote.model.UserResponse
import kotlinx.coroutines.flow.flowOf

fun UserResponse.toDomain() = flowOf(UserResponseDomain(
    avatar_url = avatarUrl,
    bio = bio,
    created_at  = createdAt,
    followers = followers,
    following = following,
    location = location,
    login = login,
    name = name,
    updated_at  = updatedAt,
))
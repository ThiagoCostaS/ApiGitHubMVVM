package com.example.apigithubmvvm.domain.mapper

import com.example.apigithubmvvm.domain.model.RepositoriesResponseDomain
import com.example.apigithubmvvm.remote.model.RepositoriesResponse
import kotlinx.coroutines.flow.flowOf

fun RepositoriesResponse.toDomain() = flowOf(
    RepositoriesResponseDomain(
        createdAt = created_at,
        defaultBranch = default_branch,
        description = description,
        disabled = disabled,
        fullName = full_name,
        id = id,
        language = language,
        name = name,
        pushedAt = pushed_at,
        updatedAt = updated_at,
        )
)
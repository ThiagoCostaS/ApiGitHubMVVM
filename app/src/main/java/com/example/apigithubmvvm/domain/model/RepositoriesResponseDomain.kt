package com.example.apigithubmvvm.domain.model

data class RepositoriesResponseDomain(
    val createdAt: String,
    val defaultBranch: String,
    val description: Any,
    val disabled: Boolean,
    val fullName: String,
    val id: Int,
    val language: String,
    val name: String,
    val pushedAt: String,
    val updatedAt: String,
)

package com.example.apigithubmvvm.remote.model

data class RepositoriesResponse(
    val created_at: String,
    val default_branch: String,
    val description: Any,
    val disabled: Boolean,
    val full_name: String,
    val id: Int,
    val language: String,
    val name: String,
    val pushed_at: String,
    val updated_at: String,
)
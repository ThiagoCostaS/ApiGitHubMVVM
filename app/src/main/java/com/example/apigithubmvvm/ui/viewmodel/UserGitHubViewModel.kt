package com.example.apigithubmvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.apigithubmvvm.domain.usecases.GetUserGitHubUseCase
import com.example.apigithubmvvm.domain.usecases.GetUserRepositoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserGitHubViewModel @Inject constructor(
    private val getUserGitHubUseCase: GetUserGitHubUseCase,
    private val getUserRepositoriesUseCase: GetUserRepositoriesUseCase
) : ViewModel() {




}
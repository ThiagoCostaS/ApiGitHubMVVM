package com.example.apigithubmvvm.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.apigithubmvvm.R
import com.example.apigithubmvvm.ui.viewmodel.UserGitHubViewModel
import dagger.hilt.android.AndroidEntryPoint
@AndroidEntryPoint
class UserGitHubActivity : AppCompatActivity() {

    private val viewModel : UserGitHubViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
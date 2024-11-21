package com.example.m5individual11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.m5individual11.ui.theme.M5Individual10Theme
import com.example.m5individual11.view.HomeView
import com.example.m5individual11.viewmodel.IMCViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel: IMCViewModel by viewModels()
        setContent {
            M5Individual10Theme {
               HomeView(viewModel)
            }
        }
    }
}


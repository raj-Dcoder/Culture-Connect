package com.rajveer.cultureconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.rajveer.cultureconnect.navigations.AppNavigation
import com.rajveer.cultureconnect.viewmodels.AuthViewModel
import kotlin.getValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val authViewModel: AuthViewModel by viewModels()
        setContent {
            Scaffold {
                AppNavigation(modifier = Modifier.padding(it), authViewModel = authViewModel)
            }
        }
    }
}
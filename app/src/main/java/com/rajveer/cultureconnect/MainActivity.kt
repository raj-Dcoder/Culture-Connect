package com.rajveer.cultureconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.rajveer.cultureconnect.pages.HomePage
import com.rajveer.cultureconnect.ui.theme.BottomBar
import com.rajveer.cultureconnect.ui.theme.CultureConnectTheme
import com.rajveer.cultureconnect.ui.theme.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomePage()
        }
    }
}
package com.rajveer.cultureconnect.ui.theme

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    TopAppBar(
        title = { Text("CultureConnect") },
        modifier = TODO(),
        navigationIcon = TODO(),
        actions = TODO(),
        expandedHeight = TODO(),
        windowInsets = TODO(),
        colors = TODO()
    )
}
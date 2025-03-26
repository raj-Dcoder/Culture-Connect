package com.rajveer.cultureconnect.pages

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.rajveer.cultureconnect.viewmodels.AuthState
import com.rajveer.cultureconnect.viewmodels.AuthViewModel

@Composable
fun LoginPage(
    modifier: Modifier,
    navController: NavHostController,
    authViewModel: AuthViewModel)
{
    var email = rememberSaveable { mutableStateOf("") }
    var password = rememberSaveable { mutableStateOf("") }

    val authState = authViewModel.authState.observeAsState()
    val context = LocalContext.current

    LaunchedEffect(authState.value) {
        when (authState.value) {
            is AuthState.Authenticated -> navController
                .navigate("home_page")

            is AuthState.Error -> Toast.makeText(
                context,
                (authState.value as AuthState.Error)
                    .message, Toast.LENGTH_SHORT
            ).show()

            else -> Unit
        }
    }

    Column(
        Modifier.fillMaxSize(1f).padding(4.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text("Login ", fontSize = 32.sp)
        Spacer(Modifier.height(32.dp))
        OutlinedTextField(
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") }
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Password") }
        )
        Spacer(Modifier.height(16.dp))
        Button(
            modifier = Modifier.fillMaxWidth(0.5f),
            onClick = {
                authViewModel.login(email.value, password.value)
            },
            shape = RoundedCornerShape(20.dp),
            enabled = authState.value != AuthState.Loading
        ) {
            Text("Login")
        }
        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Don't have account? ")
            TextButton(
                onClick = {
                    navController.navigate("sign_up")
                }
            ) {
                Text("SignUp")
            }
        }
    }
}
package com.rajveer.cultureconnect.pages

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.rajveer.cultureconnect.viewmodels.AuthState
import com.rajveer.cultureconnect.viewmodels.AuthViewModel
import com.rajveer.cultureconnect.R

@Composable
fun SignedOutPage(modifier: Modifier, navController: NavHostController, authViewModel: AuthViewModel){

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
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Culture Connect", fontSize = 32.sp)

        Spacer(Modifier.height(512.dp))

        Box(Modifier){
           Column {
               Button(
                   onClick = {
                       navController.navigate("sign_up")
                   },
                   modifier = Modifier.fillMaxWidth(0.8f),
                   shape = RoundedCornerShape(20.dp)
               ) {
                   Text(text = "Create Account", color = Color.White, fontSize = 18.sp)
               }
               Spacer(Modifier.height(20.dp))
               OutlinedButton(
                   onClick = {
                       navController.navigate("login")
                   },
                   modifier = Modifier.fillMaxWidth(0.8f),
                   shape = RoundedCornerShape(20.dp),
               ) {
                   Text("Login")
               }
           }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row(horizontalArrangement = Arrangement.Center) {
            //TODO: implement onclick feature for each
            IconButton(onClick = {}) {
                Image(painter = painterResource(R.drawable.google_login_icon), contentDescription = "Google")
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(R.drawable.twitter_login_icon), contentDescription = "Twitter")
            }
            IconButton(onClick = {}) {
                Image(painter = painterResource(R.drawable.facebook_login_icon), contentDescription = "Facebook")
            }
        }
    }
}
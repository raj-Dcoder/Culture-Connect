package com.rajveer.cultureconnect.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rajveer.cultureconnect.viewmodels.AuthViewModel
import com.rajveer.cultureconnect.R

@Composable
fun HomePage(modifier: Modifier, navController: NavHostController, authViewModel: AuthViewModel) {

    val context = LocalContext.current
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    Modifier.padding(4.dp)
                ) {
                    BoxItem(context.getString(R.string.offer_icon_button))
                    Text(context.getString(R.string.offer_icon_button),
                        Modifier.align(Alignment.CenterHorizontally))
                }
                Column(
                    Modifier.padding(4.dp)
                ) {
                    BoxItem(context.getString(R.string.events_nearby))
                    Text(context.getString(R.string.events_nearby),
                        Modifier.align(Alignment.CenterHorizontally))
                }
            }
        }
        Box(
            modifier = Modifier.fillMaxWidth()
        ){
            Row(
                modifier = Modifier.padding(4.dp)
            ) {
                Column(
                    Modifier.padding(4.dp)
                ) {
                    BoxItem(context.getString(R.string.offer_icon_button))
                    Text(context.getString(R.string.offer_icon_button),
                        Modifier.align(Alignment.CenterHorizontally))
                }
                Column(
                    Modifier.padding(4.dp)
                ) {
                    BoxItem(context.getString(R.string.events_nearby))
                    Text(context.getString(R.string.events_nearby),
                        Modifier.align(Alignment.CenterHorizontally))
                }
            }
        }
    }
}

@Composable
fun BoxItem(title: String){//TODO: implement controller
    val context = LocalContext.current

    when(title){
        context.getString(R.string.offer_icon_button) ->
            Image(painter = painterResource
                (R.drawable.offer_icon),
                contentDescription = null)
        context.getString(R.string.events_nearby) ->
            Image(painter = painterResource
                (R.drawable.events_nearby),
                contentDescription = null)
    }
}
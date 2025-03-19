package com.rajveer.cultureconnect.pages

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rajveer.cultureconnect.R

@Composable
fun HomePage(){
    val context = LocalContext.current
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.padding(bottom = 300.dp)
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
//            Row(
//                modifier = Modifier.padding(4.dp)
//            ){
//                Column(
//                    Modifier.padding(4.dp)
//                ) {
//                    BoxItem(R.string.offer_icon_button.toString())
//                    Text(R.string.offer_icon_button.toString())
//                }
//                Column(
//                    Modifier.padding(4.dp)
//                ) {
//                    BoxItem(R.string.events_nearby.toString())
//                    Text(R.string.events_nearby.toString())
//                }
//            }
        }
    }
}

@Composable
fun BoxItem(title: String){//TODO: implement navcontroller
    val context = LocalContext.current
    var itemNumber=0
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
@Preview
@Composable
fun HomePagePreview(){
    HomePage()
}
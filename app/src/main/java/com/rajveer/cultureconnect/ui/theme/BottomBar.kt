package com.rajveer.cultureconnect.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar(){
    BottomAppBar(
        modifier = Modifier.fillMaxWidth()

    ){
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            // HomeIcon
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp))
            }
            // FoodIcon
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp))
            }
            // TravelIcon
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(60.dp)

            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp))
            }
            // TouristDestIcon
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(60.dp)

            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp))
            }
            // HotelIcon
            IconButton(
                onClick = {},
                enabled = true,
                modifier = Modifier.size(60.dp)

            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp))
            }
        }

        //TODO: Navigation
        //TODO: create a composable for icon button and just call to reduce code
    }
}


@Preview
@Composable
fun BottomPreview(){
    BottomBar()
}
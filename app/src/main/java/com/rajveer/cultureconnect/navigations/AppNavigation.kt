package com.rajveer.cultureconnect.navigations

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rajveer.cultureconnect.viewmodels.AuthState
import com.rajveer.cultureconnect.viewmodels.AuthViewModel
import com.rajveer.cultureconnect.pages.FoodPage
import com.rajveer.cultureconnect.pages.HomePage
import com.rajveer.cultureconnect.pages.HotelPage
import com.rajveer.cultureconnect.pages.LoginPage
import com.rajveer.cultureconnect.pages.SignedOutPage
import com.rajveer.cultureconnect.pages.SignupPage
import com.rajveer.cultureconnect.pages.TouristDestPage
import com.rajveer.cultureconnect.pages.TravelPage

@Composable
fun AppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel){
    val navController = rememberNavController()
    NavHost(navController,
        startDestination =
            if(authViewModel.authState == AuthState.Authenticated){"home_page"}
            else{"signed_out"},
        enterTransition = {slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Right,
            tween(700))},
        exitTransition = {slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left,
            tween(700))}
    ) {
        composable("login") {
            LoginPage(modifier, navController,authViewModel)
        }
        composable("sign_up") {
            SignupPage(modifier, navController, authViewModel)
        }
        composable("home_page") {
            HomePage(modifier, navController, authViewModel)
        }
        composable("food_page") {
            FoodPage(modifier, navController, authViewModel)
        }
        composable("travel_page") {
            TravelPage(modifier, navController, authViewModel)
        }
        composable("hotel_page") {
            HotelPage(modifier, navController, authViewModel)
        }
        composable("tourist_dest_page") {
            TouristDestPage(modifier, navController, authViewModel)
        }
        composable("signed_out") {
            SignedOutPage(modifier,navController, authViewModel)
        }
    }
}
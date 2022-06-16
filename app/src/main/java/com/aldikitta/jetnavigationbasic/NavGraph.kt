package com.aldikitta.jetnavigationbasic

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetupNavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("name"){
                type = NavType.StringType
            },
                navArgument("userId"){
                    type = NavType.StringType
                },
                navArgument("timestamp"){
                    type = NavType.LongType
                },
            ),
        ) {
            val name = it.arguments?.getString("name")!!
            val userId = it.arguments?.getString("userId")!!
            val timestamp = it.arguments?.getLong("timestamp")!!
            Column() {
//                Log.i("TAG", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
//                Text(text = it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
//                Log.i("TAG", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
//                Text(text = it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
                DetailScreen(navController = navController, name, userId, timestamp)
            }

        }

    }
}
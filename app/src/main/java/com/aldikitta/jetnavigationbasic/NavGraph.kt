//package com.aldikitta.jetnavigationbasic
//
//import android.util.Log
//import androidx.compose.foundation.layout.Column
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.NavType
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.navArgument
//import com.ramcosta.composedestinations.annotation.RootNavGraph
//
//@Composable
//fun SetupNavGraph(
//    navController: NavHostController,
//) {
////    NavHost(
////        navController = navController,
////        startDestination = Screen.Home.route
////    ) {
////        composable(
////            route = Screen.Home.route
////        ) {
////            HomeScreen(navController)
////        }
////        composable(
////            route = Screen.Detail.route,
////            arguments = listOf(navArgument("name"){
////                type = NavType.StringType
////            },
////                navArgument("userId"){
////                    type = NavType.StringType
////                },
////                navArgument("timestamp"){
////                    type = NavType.LongType
////                },
////            ),
////        ) {
////            val name = it.arguments?.getString("name")!!
////            val userId = it.arguments?.getString("userId")!!
////            val timestamp = it.arguments?.getLong("timestamp")!!
////            Column() {
////                DetailScreen(navController = navController, name, userId, timestamp)
////            }
////
////        }
////
////    }
//}
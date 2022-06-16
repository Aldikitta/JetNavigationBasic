package com.aldikitta.jetnavigationbasic

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(
            onClick = { navController.navigate(route = Screen.Detail.route) },
            content = { Text(text = "Click Me") })
    }
}

//@Composable
//@Preview(showBackground = true)
//fun Preview() {
//    HomeScreen(
//        navController = rememberNavController()
//    )
//}
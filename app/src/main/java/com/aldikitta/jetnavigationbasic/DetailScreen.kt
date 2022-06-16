package com.aldikitta.jetnavigationbasic

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.aldikitta.jetnavigationbasic.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.popUpTo

@Destination
@Composable
fun DetailScreen(
    user: User,
    navigator: DestinationsNavigator
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                          navigator.navigate(
                              direction = HomeScreenDestination,
                              builder = {
                                  popUpTo(HomeScreenDestination){
                                      inclusive = true
                                  }
                              }

                          )
                },
                content = { Text(text = "This is detail") })
            Text(text = "$user", textAlign = TextAlign.Center)
        }
    }
}

//@Composable
//@Preview(showBackground = true)
//fun Detail() {
//    HomeScreen(navController = rememberNavController())
//}
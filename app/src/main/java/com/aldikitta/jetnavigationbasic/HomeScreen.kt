package com.aldikitta.jetnavigationbasic

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.aldikitta.jetnavigationbasic.destinations.DetailScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import java.time.LocalDateTime

@RootNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
//    navController: NavController
) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Button(
            onClick = {
                      navigator.navigate(
                          DetailScreenDestination(
                              User(
                                  "Aldi",
                                  "10A",
                                  LocalDateTime.now()
                              )
                          )

                      )
//                navController.navigate(route = Screen.Detail.passingArguments(
//                userId = "A10",
//                name = "Aldi",
//                timestamp = 123456789
//            )
//                )
                      },
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
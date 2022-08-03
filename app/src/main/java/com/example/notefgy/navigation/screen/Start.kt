package com.example.notefgy.navigation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.notefgy.navigation.NotesRoute
import com.example.notefgy.ui.theme.NoteFGYTheme

@Composable
fun Start(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier =  Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            
            Text(text = "What is your choice?")
            Button(
                onClick = {
                navController.navigate(route = NotesRoute.Main.route)
                },
            modifier = Modifier
                .width(200.dp)
                .padding(vertical = 8.dp)

                ) {
                Text(text = "Room DB")

            }
            Button(
                onClick = {
                    navController.navigate(route = NotesRoute.Main.route)
                },
                modifier = Modifier
                    .width(200.dp)
                    .padding(vertical = 8.dp)

            ) {
                Text(text = "Firebase DB")

            }

        }

    }

}


@Preview(showBackground = true)
@Composable
fun ViewingScreen() {
    NoteFGYTheme {
        Start(navController = rememberNavController())

    }

}
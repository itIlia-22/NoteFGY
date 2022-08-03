package com.example.notefgy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notefgy.navigation.screen.Add
import com.example.notefgy.navigation.screen.Main
import com.example.notefgy.navigation.screen.Notes
import com.example.notefgy.navigation.screen.Start

sealed class NotesRoute(val route:String){
    //ссылки на экраны
    object Start:NotesRoute("start_screen")
    object Main:NotesRoute("main_screen")
    object Add:NotesRoute("add_screen")
    object Notes:NotesRoute("notes_screen")
}
@Composable
fun NotesNavHost() {
    val navController = rememberNavController()
   NavHost(navController = navController, startDestination = NotesRoute.Start.route ){
       composable(NotesRoute.Start.route){
           Start(navController = navController)
       }
       composable(NotesRoute.Main.route){
           Main(navController = navController)
       }
       composable(NotesRoute.Add.route){
           Add(navController = navController)
       }
       composable(NotesRoute.Notes.route){
           Notes(navController = navController)
       }

   }
}
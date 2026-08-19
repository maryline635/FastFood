package com.example.fastfood

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Accueil"
    ) {

        composable("Accueil") {
            accueil(onGetStarted = {
                navController.navigate("ProfilClient")
            })
        }
        composable("ProfilClient") {
            ProfilClient(
                onValidation = {
                    navController.navigate("Validation")
                },
                onBack = {
                    navController.popBackStack()
                })
        }

        composable("Validation") {
            Validation(back = { navController.popBackStack() })
        }
    }
}
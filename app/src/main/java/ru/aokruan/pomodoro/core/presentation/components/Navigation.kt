package ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util.Screen
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.main.MainScreen
import ru.aokruan.pomodoro.splash.presentation.show_splash_screen.SplashScreen

@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(
                onPopBackStack = navController::popBackStack,
                onNavigate = navController::navigate,
            )
        }
        composable(Screen.MainScreen.route) {
            MainScreen(
                onPopBackStack = navController::popBackStack,
                onNavigate = navController::navigate
            )
        }
    }
}
package ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object MainScreen : Screen("main_screen")
}

package ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import ru.aokruan.pomodoro.core.presentation.components.ui.theme.PomodoroTheme
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.presentation.components.Navigation
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util.Screen
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.main.MainViewModel

@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PomodoroTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    Navigation(navController = navController)

                    lifecycleScope.launchWhenStarted {
                        viewModel.isLoading.collect {
                            if (!it) navController.navigate(Screen.MainScreen.route) {
                                popUpTo(Screen.SplashScreen.route) {
                                    inclusive = true
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
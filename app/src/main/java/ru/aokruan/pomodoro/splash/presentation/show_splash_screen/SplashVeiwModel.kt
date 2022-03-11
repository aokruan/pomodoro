package ru.aokruan.pomodoro.ru.aokruan.pomodoro.splash.presentation.show_splash_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.presentation.UiEvent
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util.Screen
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {

    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    init {
        viewModelScope.launch {
            _eventFlow.emit(
                UiEvent.Navigate(Screen.MainScreen.route)
            )
        }
    }
}
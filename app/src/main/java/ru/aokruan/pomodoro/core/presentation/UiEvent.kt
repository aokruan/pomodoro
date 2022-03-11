package ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.presentation

import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util.Event
import ru.aokruan.pomodoro.ru.aokruan.pomodoro.core.util.UiText

sealed class UiEvent: Event() {
    data class ShowSnackbar(val uiText: UiText) : UiEvent()
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
    object OnLogin: UiEvent()
}
package com.app.template_compose_mvvm.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
}
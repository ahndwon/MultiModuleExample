package xyz.ahndwon.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    class DashboardFlow(val msg: String) : NavigationFlow()
}
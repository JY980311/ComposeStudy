package com.example.study.naviagtionStudy.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.study.naviagtionStudy.route.Route
import com.example.study.naviagtionStudy.screen.MainScreen
import com.example.study.naviagtionStudy.screen.ScreenA
import com.example.study.naviagtionStudy.screen.ScreenB

@Composable
fun Root() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Route.Home.name) {
        composable(
            route = Route.Home.name,
            enterTransition = {
                slideInHorizontally( // 수평으로 이동
                    initialOffsetX = { -it }, // 왼쪽으로 밀어지는 느낌
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -it }, // 왼쪽으로 밀어지는 느낌
                    animationSpec = tween(300)
                )
            }
        ) {
            MainScreen(
                screenA = { navController.navigate(Route.ScreenA.name) },
                screenB = { navController.navigate(Route.ScreenB.name) }
            )
        }

        composable(
            route = Route.ScreenA.name,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { it }, // 오른쪽으로 밀어지는 느낌
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { it }, // 오른쪽으로 밀어지는 느낌
                    animationSpec = tween(300)
                )
            }
        ) {
            ScreenA(
                home = { navController.navigate(Route.Home.name) }
            )
        }

        composable(
            route = Route.ScreenB.name,
            enterTransition = {
                slideInVertically( // 수직으로 이동
                    initialOffsetY = { it }, // 아래에서 위로 올라오는 느낌
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutVertically(
                    targetOffsetY = { it }, // 아래에서 위로 올라오는 느낌
                    animationSpec = tween(300)
                )
            }
        ) {
            ScreenB(
                home = { navController.navigate(Route.Home.name) }
            )
        }
    }
}
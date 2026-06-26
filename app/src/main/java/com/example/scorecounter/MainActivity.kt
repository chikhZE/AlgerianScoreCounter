package com.example.scorecounter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.scorecounter.screens.CalcScreen
import com.example.scorecounter.screens.Cho3baScreen
import com.example.scorecounter.screens.StartScreen
import com.example.scorecounter.ui.theme.ScoreCounterTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        var keepSplashScreen = true
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition { keepSplashScreen }
        lifecycleScope.launch {
            delay(1000)
            keepSplashScreen = false
        }
        enableEdgeToEdge()
        setContent {
            ScoreCounterTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route


                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //StartScreen({},{},Modifier.padding(innerPadding))
                    NavHost(
                        navController = navController,
                        startDestination = "starter_screen"
                    ) {
                        composable("starter_screen") {
                            StartScreen(
                                navController,
                                Modifier.padding(innerPadding)
                            )
                        }
                        composable("cho3ba_screen") { Cho3baScreen(
                                navController,
                                Modifier.padding(innerPadding)
                            )

                        }
                        composable("calc_screen/{cho3baName}") { backStackEntry ->
                            val cho3baName = backStackEntry.arguments?.getString("cho3baName") ?: "علوم"
                            CalcScreen(
                                cho3baName = cho3baName,
                                navController = navController,
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                    }

                }
            }
        }
    }
}


package com.example.scorecounter.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.scorecounter.R

@Composable
fun Cho3baScreen(
    nameOfRoute: String,
    navController: NavHostController,
    modifier: Modifier = Modifier,
    backgroundColor: Color = Color(0xFF0E6495),

    ) {
    Scaffold(
        topBar = {
            SimpleTopBar(
                "اختيار الشعبة",
                {
                    navController.popBackStack()
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CardChoice(
                "علوم تجريبية",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/علوم")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            CardChoice(
                "رياضيات",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/رياضيات")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            CardChoice(
                "تقني رياضي",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/تقني")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            CardChoice(
                "آداب وفلسفة",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/آداب")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            CardChoice(
                "تسيير واقتصاد",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/تسيير")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))

            CardChoice(
                "لغات اجنبية",
                backgroundColor = backgroundColor,
                {
                    navController.navigate("$nameOfRoute/لغات")
                }
            )
        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTopBar(
    title: String = "Top app bar",
    onClick: () -> Unit
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 28.sp,
                modifier = Modifier
                    .padding(24.dp)
            )
        },
        navigationIcon = {
            IconButton(
                onClick = onClick
            )  {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )
            }
        }
    )
}
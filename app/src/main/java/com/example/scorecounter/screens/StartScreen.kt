package com.example.scorecounter.screens

import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.scorecounter.R

@Composable
fun StartScreen(
    navController: NavHostController,
    onBemClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        CardChoice(
            title = "حساب معدل شهادة البكالوريا",
            backgroundColor = Color(0xFF0E6495),
            onClick = {
                navController.navigate("cho3ba_screen")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))


        CardChoice(
            title = "حساب معدل شهادة البيام",
            backgroundColor = Color(0xFF10B981),
            onClick = onBemClick
        )
        Spacer(modifier = Modifier.height(16.dp))


        /*CardChoice(
            title = "معدلات قبول التخصصات الجامعية",
            backgroundColor = Color(0xFFEE9B00),
            onClick = onBemClick
        )*/
    }
}

@Composable
fun CardChoice(
    title: String,
    backgroundColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                modifier = Modifier.padding(horizontal = 12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White,
                style = TextStyle(textDirection = TextDirection.Content)
            )
            Icon(
                painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun StartScreenPreview() {
    //StartScreen(onBacClick = {}, onBemClick = {})
}
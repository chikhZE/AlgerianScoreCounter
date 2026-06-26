package com.example.scorecounter.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.scorecounter.getSubjectsOfCho3ba
import com.example.scorecounter.ui.theme.ScoreCounterTheme

@Composable
fun CalcScreen(
    cho3baName: String,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val subjectList = remember(cho3baName) {
    getSubjectsOfCho3ba(cho3baName)
    }
    var showDialog by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            SimpleTopBar(
                "حساب المعدل",
                {
                    navController.popBackStack()
                }
            )
        },

    ) { innerPadding ->
        Box(
            modifier = modifier
                .padding(horizontal = 16.dp)
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .padding(innerPadding)
            ) {
                items(subjectList) { item ->
                    if(cho3baName == "بيام") {
                        SubjectCard(
                            item.name,
                            Color(0xFF10B981)
                        )
                    } else{
                        SubjectCard(
                            item.name
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)

            ) {
                Button(
                    onClick = {
                        showDialog = true
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "حساب المعدل"
                    )
                }
            }
        }


        if(showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    Button(onClick = { showDialog = false }) { Text("تم") }
                },
                title = { Text("المعدل النهائي") },
                text = { Text("معدلك المتوقع هو: 15.34") }
            )
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun CalcScreenPreview() {
    ScoreCounterTheme() {

    //CalcScreen()
    }
}

@Preview
@Composable
fun SubjectCard(
    title: String = "المادة",
    backgroundColor: Color = Color(0xFF0E6495),
    modifier: Modifier = Modifier,

    ) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
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
            OutlinedTextField(
                value = "0",
                onValueChange = {},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                ),
                modifier = Modifier
                    .width(100.dp),
                singleLine = true,
                textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center)

                )

        }
    }
}
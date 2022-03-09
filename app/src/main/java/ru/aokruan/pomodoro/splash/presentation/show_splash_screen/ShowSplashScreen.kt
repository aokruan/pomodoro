package ru.aokruan.pomodoro.splash.presentation.show_splash_screen

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.aokruan.pomodoro.R

@Composable
fun ShowSplashScreen() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Column {
            Image(
                painterResource(id = R.drawable.ic_tomato),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Pomodoro",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(
                modifier = Modifier
                    .background(Color.White)
                    .width(15.dp)
                    .height(1.dp)
            )
        }
    }
}
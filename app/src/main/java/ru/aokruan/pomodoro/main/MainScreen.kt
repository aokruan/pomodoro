package ru.aokruan.pomodoro.ru.aokruan.pomodoro.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import ru.aokruan.pomodoro.R

@Composable
@Preview
fun MainScreen(
    dispatcher: CoroutineDispatcher = Dispatchers.Main,
    onPopBackStack: () -> Unit = {},
    onNavigate: (String) -> Unit = {},
    viewModel: MainViewModel = hiltViewModel()
) {
    Column(
        Modifier
            .padding(8.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(R.drawable.ic_flag),
                contentDescription = null,
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Red, CircleShape)   // add a border (optional)
            )
            Image(
                painter = painterResource(R.drawable.ic_flag),
                contentDescription = null,
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Red, CircleShape)   // add a border (optional)
            )
            Image(
                painter = painterResource(R.drawable.ic_flag),
                contentDescription = null,
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Red, CircleShape)   // add a border (optional)
            )
            Image(
                painter = painterResource(R.drawable.ic_flag),
                contentDescription = null,
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Red, CircleShape)   // add a border (optional)
            )
        }

        Text(
            "00:00",
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row() {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(start = 4.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.ic_play),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 4.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.ic_pause),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(start = 4.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.ic_stop),
                    contentDescription = null,
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
        }
    }
}
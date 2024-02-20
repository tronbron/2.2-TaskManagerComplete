package com.example.taskmanagercomplete

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagercomplete.ui.theme.TaskManagerCompleteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerCompleteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialCompleteText(
                        heading = stringResource(R.string.heading),
                        text = stringResource(R.string.text)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialCompleteText(heading: String, text: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
            Image(
            painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            )
            Text(
                text = heading,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .padding(bottom = 8.dp),
                fontWeight = Bold
            )
            Text(
                text = text,
                fontSize = 16.sp
            )
    }
}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    TaskManagerCompleteTheme {
        TutorialCompleteText(
            heading = stringResource(R.string.heading),
            text = stringResource(R.string.text)
        )
    }
}
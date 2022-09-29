package com.mentoria.mentoriaghibli.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mentoria.mentoriaghibli.domain.model.Films
import com.mentoria.mentoriaghibli.presentation.ui.theme.MentoriaghibliTheme

class GhibliAppActivity : ComponentActivity() {
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MentoriaghibliTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val state = viewModel.uiState.collectAsState().value
                    when (state) {
                        is HomeState.Error -> TODO()
                        HomeState.Loading -> TODO()
                        is HomeState.Success -> GhibliList(movies = state.list)
                    }

                }
            }
        }
    }
}

@Composable
fun GhibliList(movies: List<Films>) {
    movies.forEach {
        Row {
            Text(text = it.title)
        }
    }
}

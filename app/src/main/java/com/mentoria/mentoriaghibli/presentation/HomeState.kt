package com.mentoria.mentoriaghibli.presentation

import androidx.annotation.StringRes
import com.mentoria.mentoriaghibli.domain.model.Films

sealed class HomeState {
    data class Success(
        val list: List<Films>
    ): HomeState()

    data class Error(
        val error: Throwable,
        @StringRes val errorMessage: Int
    ): HomeState()

    object Loading: HomeState()
}

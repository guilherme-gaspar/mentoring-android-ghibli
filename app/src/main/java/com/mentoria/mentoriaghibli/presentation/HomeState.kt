package com.mentoria.mentoriaghibli.presentation

import com.mentoria.mentoriaghibli.domain.model.Films

sealed class HomeState {
    data class Success(
        val list: List<Films>
    ): HomeState()

    data class Error(
        val error: Throwable
    ): HomeState()

    object Loading: HomeState()
}

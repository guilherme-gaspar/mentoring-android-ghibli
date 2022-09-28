package com.mentoria.mentoriaghibli.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mentoria.mentoriaghibli.R
import com.mentoria.mentoriaghibli.domain.usecase.GetFilmsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getFilmsUseCase: GetFilmsUseCase
): ViewModel() {

    private val _uiState = MutableStateFlow<HomeState>(HomeState.Success(emptyList()))

    val uiState: StateFlow<HomeState> = _uiState

    init {
        getFilms()
    }

    fun getFilms() = viewModelScope.launch {
        getFilmsUseCase()
            .onSuccess {
                _uiState.value = HomeState.Success(it)
            }
            .onFailure {
                _uiState.value = HomeState.Error(it, R.string.generic_error)
            }
    }
}
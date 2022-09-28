package com.mentoria.mentoriaghibli.domain.usecase

import com.mentoria.mentoriaghibli.domain.repository.GhibliRepository

class GetFilmsUseCase(
    private val repository: GhibliRepository
) {
    suspend operator fun invoke() = repository.getFilms()
}
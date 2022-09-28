package com.mentoria.mentoriaghibli.domain.repository

import com.mentoria.mentoriaghibli.domain.model.Films

interface GhibliRepository {
    suspend fun getFilms(): Result<List<Films>>
}
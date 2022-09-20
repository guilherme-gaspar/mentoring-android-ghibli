package com.mentoria.mentoriaghibli.data.datasource

import com.mentoria.mentoriaghibli.domain.model.Films

interface GhibliRemoteDataSource {
    suspend fun getFilms(): Result<List<Films>>
}
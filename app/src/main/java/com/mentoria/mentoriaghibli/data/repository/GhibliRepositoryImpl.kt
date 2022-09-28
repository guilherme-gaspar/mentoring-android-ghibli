package com.mentoria.mentoriaghibli.data.repository

import com.mentoria.mentoriaghibli.data.datasource.GhibliRemoteDataSource
import com.mentoria.mentoriaghibli.domain.model.Films
import com.mentoria.mentoriaghibli.domain.repository.GhibliRepository

class GhibliRepositoryImpl(
    private val remoteDataSource: GhibliRemoteDataSource
): GhibliRepository {
    override suspend fun getFilms(): Result<List<Films>> {
        return remoteDataSource.getFilms()
    }

}
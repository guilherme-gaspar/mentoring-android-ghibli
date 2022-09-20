package com.mentoria.mentoriaghibli.data.datasource

import com.mentoria.mentoriaghibli.data.service.GhibliService
import com.mentoria.mentoriaghibli.domain.model.Films

class GhibliRemoteDataSourceImpl(
    private val service: GhibliService
): GhibliRemoteDataSource {
    override suspend fun getFilms(): Result<List<Films>> {
        return Result.success(listOf())
    }
}
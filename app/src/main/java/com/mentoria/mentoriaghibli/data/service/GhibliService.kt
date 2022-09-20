package com.mentoria.mentoriaghibli.data.service

import com.mentoria.mentoriaghibli.data.model.FilmsResponse
import retrofit2.http.GET

interface GhibliService {

    @GET("/films")
    suspend fun getFilms(): Result<List<FilmsResponse>>
}
package com.mentoria.mentoriaghibli.data.mapper

import com.mentoria.mentoriaghibli.data.model.FilmsResponse
import com.mentoria.mentoriaghibli.domain.model.Films

fun FilmsResponse.mapToDomain(): Films {
    return Films(
        title = title,
        imageUrl = image,
        runningTime = runningTime,
        score = rtScore
    )
}
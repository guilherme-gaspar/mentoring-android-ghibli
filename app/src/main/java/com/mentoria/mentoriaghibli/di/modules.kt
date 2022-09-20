package com.mentoria.mentoriaghibli.di

import com.mentoria.mentoriaghibli.data.retrofit.getInstance
import com.mentoria.mentoriaghibli.data.service.GhibliService
import org.koin.dsl.module
import retrofit2.Retrofit

val ghibliModules = module {

    // Todo(Criar objeto retrofit)
    factory {
        getInstance()
    }

    factory {
        get<Retrofit>().create(GhibliService::class.java)
    }

}
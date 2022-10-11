package com.mentoria.mentoriaghibli.di

import com.mentoria.mentoriaghibli.data.datasource.GhibliRemoteDataSourceImpl
import com.mentoria.mentoriaghibli.data.repository.GhibliRepositoryImpl
import com.mentoria.mentoriaghibli.data.retrofit.getInstance
import com.mentoria.mentoriaghibli.data.service.GhibliService
import com.mentoria.mentoriaghibli.domain.repository.GhibliRepository
import com.mentoria.mentoriaghibli.domain.usecase.GetFilmsUseCase
import com.mentoria.mentoriaghibli.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val retrofit = getInstance()

val ghibliModules = module {
    factory {
        retrofit
    }

    factory {
        get<Retrofit>().create(GhibliService::class.java)
    }

    viewModel {
        HomeViewModel(getFilmsUseCase = GetFilmsUseCase(
            repository = GhibliRepositoryImpl(
                remoteDataSource = GhibliRemoteDataSourceImpl(
                    service = get()
                )
            )
        ))
    }

}
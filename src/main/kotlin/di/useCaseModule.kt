package org.example.di

import org.example.logic.use_case.GetCitiesNamesWithTopSalaryUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { GetCitiesNamesWithTopSalaryUseCase(get()) }
}
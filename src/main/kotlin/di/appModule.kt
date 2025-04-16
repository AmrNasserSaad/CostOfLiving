package org.example.di

import org.example.data.repo_impl.CsvCitiesRepo
import org.example.data.utils.CitiesCsvParser
import org.example.data.utils.CsvFileReader
import org.example.logic.repo.CitiesRepo
import org.example.logic.use_case.GetCitiesNamesWithTopSalaryUseCase
import org.koin.dsl.module
import java.io.File

val appModule = module {

    single { File("costOfLiving.csv") }
    single { CsvFileReader(get()) }
    single { CitiesCsvParser() }

    single<CitiesRepo> { CsvCitiesRepo(get(), get()) }


    // single { Ui(get(),get(),get())}
}
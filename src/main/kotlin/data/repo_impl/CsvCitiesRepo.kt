package org.example.data.repo_impl

import org.example.data.utils.CitiesCsvParser
import org.example.data.utils.CsvFileReader
import org.example.logic.repo.CitiesRepo
import org.example.data.model.City

class CsvCitiesRepo(
    private val csvFileReader: CsvFileReader,
    private val citiesCsvParser: CitiesCsvParser
) : CitiesRepo {
    override fun getAllCities(): List<City> {
        return csvFileReader.readLinesFromFile().map {
            citiesCsvParser.parseOneLine(it)
        }
    }


}
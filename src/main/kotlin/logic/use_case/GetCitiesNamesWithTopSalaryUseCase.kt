package org.example.logic.use_case

import org.example.data.model.City
import org.example.logic.repo.CitiesRepo

class GetCitiesNamesWithTopSalaryUseCase(
    private val citiesRepo: CitiesRepo
) {

    fun getTopNCitiesNames(n: Int): List<String> {

        return citiesRepo.getAllCities()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.averageMonthlyNetSalaryAfterTax }
            .take(n)
            .map { it.cityName }

    }

    private fun excludeNullSalariesAndLowQualityData(city: City): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}
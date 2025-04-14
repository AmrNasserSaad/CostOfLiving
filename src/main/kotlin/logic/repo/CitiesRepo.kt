package org.example.logic.repo

import org.example.data.model.City

interface CitiesRepo {

    fun getAllCities (): List<City>

}
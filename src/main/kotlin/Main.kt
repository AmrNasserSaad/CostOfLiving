package org.example

import org.example.data.utils.CitiesCsvParser
import org.example.data.repo_impl.CsvCitiesRepo
import org.example.data.utils.CsvFileReader
import org.example.logic.repo.CitiesRepo
import org.example.logic.use_case.GetCitiesNamesWithTopSalaryUseCase
import java.io.File

fun main() {

    /* video impl
    val csvFile = File("costOfLiving.csv")

    csvFile.readLines().forEach { cityInformationString ->
        val cityInfo = cityInformationString.split(",")
        println("${cityInfo[1]} , the price of the Apples is : ${cityInfo[17]} ")
    }


     */

    /*
    get the max by if
    val csvFile = File("costOfLiving.csv")

    var maxApplePrice = 0.0
    var cityWithMaxPrice = ""

    csvFile.readLines().forEach { cityInformationString ->
        val cityInfo = cityInformationString.split(",")
        val applePrice = cityInfo[17].toDoubleOrNull() ?: 0.0

        if (applePrice > maxApplePrice) {
            maxApplePrice = applePrice
            cityWithMaxPrice = cityInfo[1]
        }
    }

    println("The city with the highest apple price is $cityWithMaxPrice at \$$maxApplePrice")
    */

    /*
    get the max by functional  programming

    val csvFile = File("costOfLiving.csv")

     val cityWithMaxApplePrice = csvFile.readLines()
         .map { line -> line.split(",") }
         .maxByOrNull { cityInfo ->
             cityInfo.getOrNull(17)?.toDoubleOrNull() ?: 0.0
         }

     println(cityWithMaxApplePrice)

 //        ?.let { cityInfo ->
 //        val cityName = cityInfo.getOrNull(1) ?: "Unknown City"
 //        val applePrice = cityInfo.getOrNull(17)?.toDoubleOrNull() ?: 0.0
 //        println("The city with the highest apple price is $cityName at \$$applePrice")
 //      }

     */


    // reading
    val fileName = "costOfLiving.csv"
    val csvFile = File(fileName)
    val csvFileReader = CsvFileReader(csvFile)

    // parsing
    val csvParser = CitiesCsvParser()

    // di repo
    val citiesRepo: CitiesRepo = CsvCitiesRepo(csvFileReader, csvParser)


    // ui
    val getCitiesNamesWithTopSalaryUseCase = GetCitiesNamesWithTopSalaryUseCase(citiesRepo)
    println(getCitiesNamesWithTopSalaryUseCase.getTopNCitiesNames(n = 4))


}
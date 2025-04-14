package org.example.data.utils

import java.io.File

class CsvFileReader(
    private val csvFile: File
) {
    fun readLinesFromFile(): List<String> {
        return csvFile.readLines()
    }
}
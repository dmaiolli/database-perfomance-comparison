package br.com.denys.databaseperformancecomparison

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DatabasePerformanceComparisonApplication

fun main(args: Array<String>) {
	runApplication<DatabasePerformanceComparisonApplication>(*args)
}

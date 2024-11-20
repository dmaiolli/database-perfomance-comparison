package br.com.denys.databaseperformancecomparison.repository

import br.com.denys.databaseperformancecomparison.model.Library
import org.springframework.data.jpa.repository.JpaRepository

interface LibraryRepository : JpaRepository<Library, Long> {
}
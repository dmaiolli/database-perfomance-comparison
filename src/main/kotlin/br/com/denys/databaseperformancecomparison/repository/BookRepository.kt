package br.com.denys.databaseperformancecomparison.repository

import br.com.denys.databaseperformancecomparison.model.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository : JpaRepository<Book, Long> {
}
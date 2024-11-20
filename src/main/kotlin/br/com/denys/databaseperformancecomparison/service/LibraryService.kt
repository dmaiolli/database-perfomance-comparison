package br.com.denys.databaseperformancecomparison.service

import br.com.denys.databaseperformancecomparison.controller.request.CreateLibraryRequest
import br.com.denys.databaseperformancecomparison.model.Book
import br.com.denys.databaseperformancecomparison.model.Library
import br.com.denys.databaseperformancecomparison.repository.BookRepository
import br.com.denys.databaseperformancecomparison.repository.LibraryRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
@Service
@Transactional
class LibraryService(
    private val libraryRepository: LibraryRepository,
    private val bookRepository: BookRepository
) {

    fun createLibrary(body: CreateLibraryRequest): Library {
        val library = Library(name = body.name, location = body.location)
        return libraryRepository.save(library)
    }

    fun addBookToLibrary(libraryId: Long, title: String, author: String, publicationYear: Int): Book {
        val library = libraryRepository.findById(libraryId).orElseThrow { Exception("Library not found") }
        val book = Book(title = title, author = author, publicationYear = publicationYear, library = library)
        return bookRepository.save(book)
    }
}

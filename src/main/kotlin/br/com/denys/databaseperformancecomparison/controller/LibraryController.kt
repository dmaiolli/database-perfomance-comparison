package br.com.denys.databaseperformancecomparison.controller

import br.com.denys.databaseperformancecomparison.controller.request.CreateLibraryRequest
import br.com.denys.databaseperformancecomparison.model.Book
import br.com.denys.databaseperformancecomparison.model.Library
import br.com.denys.databaseperformancecomparison.service.LibraryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/libraries")
class LibraryController(
    private val libraryService: LibraryService
) {

    @PostMapping
    fun createLibrary(@RequestParam body: CreateLibraryRequest): Library {
        return libraryService.createLibrary(body)
    }

    @PostMapping("/{libraryId}/books")
    fun addBookToLibrary(
        @PathVariable libraryId: Long,
        @RequestParam title: String,
        @RequestParam author: String,
        @RequestParam publicationYear: Int
    ): Book {
        return libraryService.addBookToLibrary(libraryId, title, author, publicationYear)
    }
}

package com.mezoo.bookservice.service.impl

import com.mezoo.bookservice.domain.Book
import com.mezoo.bookservice.service.IBookService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Service
internal class BookService : IBookService {
    override fun bookList(): ArrayList<Book>{
        return  arrayListOf(Book(1L, "Robert C. Martin", "Clean Code"), Book(2L, "Robert C. Martin","Clean Architecture"))
    }

    override fun findBook(@PathVariable bookId: Long): Book{
        return bookList().stream().filter { book ->  book.id.equals(bookId)}.findFirst().orElse(null)
    }
}
package com.mezoo.bookservice.controller

import com.mezoo.bookservice.domain.Book
import com.mezoo.bookservice.service.IBookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/books")
class BookService{

    @Autowired
    lateinit var bookService: IBookService

    @GetMapping("")
    fun findAllBooks(): List<Book>{
        return bookService.bookList()
    }
}
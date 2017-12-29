package com.mezoo.bookservice.service

import com.mezoo.bookservice.domain.Book
import java.util.ArrayList

//TODO refactor name
interface IBookService {
    fun bookList(): ArrayList<Book>
    fun findBook(id: Long): Book
}
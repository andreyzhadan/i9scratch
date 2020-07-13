package com.epam;

import com.epam.datastore.BookService;
import com.epam.datastore.kind.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book createBook(@RequestBody Book newBook) {
        return bookService.saveBook(newBook);
    }

    @GetMapping
    public Iterable<Book> getBooks(@RequestParam Optional<String> author) {
        return bookService.getBooks(author);
    }
}

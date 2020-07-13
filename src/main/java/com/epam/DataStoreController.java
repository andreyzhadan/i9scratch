package com.epam;

import com.epam.datastore.BookRepository;
import com.epam.datastore.kind.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("books")
public class DataStoreController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book createBook(@RequestBody Book newBook) {
        return this.bookRepository.save(newBook);
    }

    @GetMapping
    public Iterable<Book> getBooks(@RequestParam Optional<String> author) {
        if (author.isPresent()) {
            return bookRepository.findByAuthor(author.get());
        } else {
            return bookRepository.findAll();
        }
    }
}

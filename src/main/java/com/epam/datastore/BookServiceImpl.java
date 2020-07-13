package com.epam.datastore;

import com.epam.datastore.kind.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book newBook) {
        return bookRepository.save(newBook);
    }

    @Override
    public Iterable<Book> getBooks(Optional<String> author) {
        if (author.isPresent()) {
            return bookRepository.findByAuthor(author.get());
        }
        return bookRepository.findAll();
    }
}

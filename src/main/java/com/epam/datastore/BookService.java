package com.epam.datastore;

import com.epam.datastore.kind.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface BookService {

    Book saveBook(Book newBook);

    Iterable<Book> getBooks(Optional<String> author);
}

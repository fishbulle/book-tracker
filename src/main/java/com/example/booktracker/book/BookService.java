package com.example.booktracker.book;

import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Value
@Service
public class BookService {

    BookRepository bookRepository;

    public Optional<Book> create(NewBookRequest book) {
        Book b = new Book();
        b.setId(book.id());
        b.setTitle(book.title());
        b.setSeries(book.series());
        b.setFormat(book.format());
        b.setPages(book.pages());
        b.setPublishDate(book.publishDate());
        b.setIsbn(book.isbn());

        bookRepository.save(b);

        return Optional.of(b);
    }

    // metod för att koppla bok till författare
}

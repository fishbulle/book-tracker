package com.example.booktracker.service;

import com.example.booktracker.repository.BookRepository;
import com.example.booktracker.dto.NewBookRequest;
import com.example.booktracker.entity.Book;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

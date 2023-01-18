package com.example.booktracker.book;

import lombok.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Value
@RestController
public class BookController {

    BookService bookService;

    // list books

    @PostMapping("/create-book")
    public NewBookRequest createBook(@RequestBody NewBookRequest book) {
        return bookService.create(book)
                .map(this::toDTO)
                .orElseThrow();
    }

    // update book

    public NewBookRequest toDTO(Book book) {
        return new NewBookRequest(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getSeries(),
                book.getFormat(),
                book.getPages(),
                book.getPublishDate(),
                book.getIsbn());
    }

}

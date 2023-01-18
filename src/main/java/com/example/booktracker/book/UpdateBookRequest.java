package com.example.booktracker.book;

import java.time.LocalDate;

public record UpdateBookRequest(String title,
                                String series,
                                String format,
                                String pages,
                                LocalDate publishDate,
                                String isbn) {
}


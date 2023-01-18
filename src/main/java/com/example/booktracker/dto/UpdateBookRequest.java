package com.example.booktracker.dto;

import java.time.LocalDate;

public record UpdateBookRequest(String title,
                                String series,
                                String format,
                                String pages,
                                LocalDate publishDate,
                                String isbn) {
}


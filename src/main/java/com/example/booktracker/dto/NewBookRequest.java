package com.example.booktracker.dto;

import com.example.booktracker.entity.Author;

import java.time.LocalDate;
import java.util.UUID;

public record NewBookRequest(UUID id,
                             String title,
                             Author author,
                             String series,
                             String format,
                             Integer pages,
                             LocalDate publishDate,
                             String isbn) {
}


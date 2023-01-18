package com.example.booktracker.author;

import java.util.UUID;

public record NewAuthorRequest(UUID id,
                               String firstName,
                               String lastName) {
}


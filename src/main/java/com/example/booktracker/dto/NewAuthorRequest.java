package com.example.booktracker.dto;

import java.util.UUID;

public record NewAuthorRequest(UUID id,
                               String firstName,
                               String lastName) {
}


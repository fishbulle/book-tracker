package com.example.booktracker.service;

import com.example.booktracker.repository.AuthorRepository;
import com.example.booktracker.dto.NewAuthorRequest;
import com.example.booktracker.entity.Author;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Value
@Service
public class AuthorService {

    AuthorRepository authorRepository;

    public Optional<Author> create(NewAuthorRequest author) {
        Author a = new Author();
        a.setId(author.id());
        a.setFirstName(author.firstName());
        a.setLastName(author.lastName());

        authorRepository.save(a);

        return Optional.of(a);
    }
}

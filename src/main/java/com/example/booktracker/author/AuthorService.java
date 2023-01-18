package com.example.booktracker.author;

import lombok.Value;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.net.http.HttpHeaders;
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

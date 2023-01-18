package com.example.booktracker.author;

import com.example.booktracker.book.NewBookRequest;
import lombok.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Value
@RestController
public class AuthorController {

    AuthorService authorService;

    @PostMapping("/create-author")
    public NewAuthorRequest createAuthor(@RequestBody NewAuthorRequest author) {
        return authorService.create(author)
                .map(this::toDTO)
                .orElseThrow();
    }

    // create author

    // connect author to book

    // update author

    // list authors

    public NewAuthorRequest toDTO(Author author) {
        return new NewAuthorRequest(
                author.getId(),
                author.getFirstName(),
                author.getLastName());
    }

}

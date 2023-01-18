package com.example.booktracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookTrackerApplication.class, args);
    }

  /*  @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository,
                                       AuthorRepository authorRepository) {

        return args -> {
            Book book = new Book(
                    UUID.randomUUID(),
                    "Testboken",
                    null,
                    "Serie två",
                    "Pocket",
                    423,
                    LocalDate.of(2001, Month.MAY, 16),
                    "AMIH1243ADHH-daasdgf"
            );

            Book book2 = new Book(
                    UUID.randomUUID(),
                    "Testboken2",
                    null,
                    "Serie tre",
                    "Hardcover",
                    200,
                    LocalDate.of(2015, Month.MARCH, 8),
                    "A4481243ADHH-da134dgf"
            );

            Book book3 = new Book(
                    UUID.randomUUID(),
                    "Testboken2",
                    null,
                    "Serie fyra",
                    "Hardcover",
                    200,
                    LocalDate.of(2015, Month.MARCH, 8),
                    "A4481243ADHH-da134dgf"
            );

            bookRepository.save(book);
            bookRepository.save(book2);
            bookRepository.save(book3);


            Author SJM = new Author(
                    UUID.randomUUID(),
                    "Sarah J.",
                    "Maas",
                    null
            );

            Author BAJS = new Author(
                    UUID.randomUUID(),
                    "Tolle",
                    "Pruttsson",
                    null
            );

            authorRepository.save(SJM);
            authorRepository.save(BAJS);
        };
    }*/

}

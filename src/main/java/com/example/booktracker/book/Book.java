package com.example.booktracker.book;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "books")
@Table(name = "Books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {

    @Id
    @Column(name = "book_id")
    private UUID id;

    @Column(name = "title")
    private String title;

    // connect author

    @Column(name = "series")
    private String series;

    @Column(name = "format")
    private String format;

    @Column(name = "pages")
    private Integer pages;

    @Column(name = "publish_date")
    private String publishDate;  // change to Date instead of String ?

    @Column(name = "isbn")
    private Integer isbn;

}

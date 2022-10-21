package com.junit.test.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String author;
    private LocalDate publicationDate;
}

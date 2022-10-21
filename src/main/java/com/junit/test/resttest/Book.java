package com.junit.test.resttest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String author;
    private LocalDate publicationDate;
}

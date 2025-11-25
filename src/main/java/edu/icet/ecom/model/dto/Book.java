package edu.icet.ecom.model.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {

    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String category;
    private int availableCopies;
}

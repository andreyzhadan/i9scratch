package com.epam.datastore.kind;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "books")
@Getter
@Setter
@ToString
public class Book {

    @Id
    private Long id;

    private String title;

    private String author;

    private int year;
}
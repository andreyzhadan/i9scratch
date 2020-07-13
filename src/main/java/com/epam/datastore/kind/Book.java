package com.epam.datastore.kind;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "books")
public class Book {

    @Id
    private Long id;

    private String title;

    private String author;

    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() { }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", author='" + this.author + '\'' +
                ", year=" + this.year +
                '}';
    }
}
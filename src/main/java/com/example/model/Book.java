package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "isbn")
 private Integer isbn ;
 @Column(name = "description")
 private String description;
 @Column(name = "name")
 private String name ;

    public Book() {
    }

    public Book(Integer isbn, String description, String name) {
        this.isbn = isbn;
        this.description = description;
        this.name = name;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

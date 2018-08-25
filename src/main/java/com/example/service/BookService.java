package com.example.service;

import com.example.model.Book;

public interface BookService {

    Book save(Book book);

    Book getById(Integer id);

    void deleteStudent(Integer id);
}

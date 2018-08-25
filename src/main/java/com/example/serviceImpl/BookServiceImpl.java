package com.example.serviceImpl;

import com.example.model.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book getById(Integer id) {
        return bookRepository.getOne(id);
    }

    public void deleteStudent(Integer id) {
        bookRepository.delete(id);
    }

}

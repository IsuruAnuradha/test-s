package com.example.controller.bookcontroller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

    @RequestMapping(value = {
            "/id"}, method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getByID(@PathVariable("id") Integer id) {
        return bookService.getById(id);
    }

    @RequestMapping(value = {
            "/id"}, method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        Book book = bookService.getById(id);
        if (null == book) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        } else {
            bookService.deleteStudent(id);
            return new ResponseEntity(HttpStatus.OK);
        }
    }
}

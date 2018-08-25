package com.example.demo;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(BookRepository bookRepository){
//		return args->{
//	      bookRepository.save(new Book(1212,"sasa","5656"));
//		};
//	}
}

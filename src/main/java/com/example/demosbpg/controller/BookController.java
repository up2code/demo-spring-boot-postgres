package com.example.demosbpg.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demosbpg.entity.Book;
import com.example.demosbpg.repository.BookRepository;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
}

package com.example.demosbpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demosbpg.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    
}

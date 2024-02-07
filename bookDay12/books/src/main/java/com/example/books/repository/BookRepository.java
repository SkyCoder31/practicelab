package com.example.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.books.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
    
}

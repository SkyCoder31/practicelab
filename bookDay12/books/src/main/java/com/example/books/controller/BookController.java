package com.example.books.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.books.entity.Book;
import com.example.books.service.BookService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllEmployees() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Optional<Book> getEmployeeById(@PathVariable Long id){
        return bookService.getBookById(id);
        
    }
    @PostMapping
    public Book saveEmployee(@RequestBody Book book){
        return bookService.saveBook(book);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateEmployee(@PathVariable Long id, @RequestBody Book updatedBook){
        Optional<Book> optionalBook= bookService.updateBook(id, updatedBook);
        return optionalBook.map(book ->new ResponseEntity<>(book,HttpStatus.OK)).orElseGet(()->new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        bookService.deleteBook(id);
    }
    }
    
    

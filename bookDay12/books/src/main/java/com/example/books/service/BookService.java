package com.example.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.entity.Book;
import com.example.books.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    

    public List<Book> getAllBooks(){

        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public Optional<Book> updateBook(Long id, Book updatedBook){
        return bookRepository.findById(id).map(book ->{
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setIsbn(updatedBook.getIsbn());
            book.setQuantity(updatedBook.getQuantity());
            return bookRepository.save(book);
        });
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    
    
}

package com.example.service;

import com.example.entity.*;
import com.example.repository.*;
import java.util.*;

// required interface
interface IBookService {
  Book addBook(Book book);

  void deleteBook(int id);

  Book updateBook(Book updateData);

  List<Book> getAllBooks();
}

// class implementing the interface
public class BookServiceImpl implements IBookService {
  private BookRepositoryImpl bookRepo = new BookRepositoryImpl();

  public Book addBook(Book book) {
    return bookRepo.addBook(book);
  }

  public void deleteBook(int bookId) {
    bookRepo.deleteBook(bookId);
  }

  public Book updateBook(Book newBook) {
    return bookRepo.updateBook(newBook);
  }

  public List<Book> getAllBooks() {
    return bookRepo.getAllBooks();
  }
}
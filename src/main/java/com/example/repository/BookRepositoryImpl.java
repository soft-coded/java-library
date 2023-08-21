package com.example.repository;

import com.example.entity.*;
import java.util.*;
import java.util.stream.Collectors;

// the interface for book repository
interface IBookRepository {
  Book addBook(Book book);

  void deleteBook(int id);

  Book updateBook(Book book);

  List<Book> getAllBooks();
}

// class implementing the interface
public class BookRepositoryImpl implements IBookRepository {
  private List<Book> books = new ArrayList<>();

  public Book addBook(Book book) {
    // don't add if already present
    if (books.contains(book))
      return book;

    books.add(book);
    return book;
  }

  public void deleteBook(int bookId) {
    books.removeIf((bookObj) -> bookObj.getId() == bookId);
  }

  public Book updateBook(Book newBook) {
    this.books
        .stream()
        .filter((bookObj) -> bookObj.getId() == newBook.getId())
        .forEach((bookObj) -> {
          bookObj.setTitle(newBook.getTitle());
          bookObj.setAuthor(newBook.getAuthor());
          bookObj.setDescription(newBook.getDescription());
          bookObj.setPrice(newBook.getPrice());
          bookObj.setPublisher(newBook.getPublisher());
          bookObj.setQuantity(newBook.getQuantity());
          // id cannot be changed
        });

    return this.books
        .stream()
        .filter((bookObj) -> bookObj.getId() == newBook.getId())
        .collect(Collectors.toList())
        .get(0);
  }

  public List<Book> getAllBooks() {
    return books;
  }
}

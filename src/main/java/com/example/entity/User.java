package com.example.entity;

import java.util.*;

public class User {
  private int id;
  private String username, email;
  private List<Book> loanedBooks;

  // default constructor
  public User() {
  }

  // parameterized constructor
  public User(int id, String username, String email) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.loanedBooks = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Book> getLoanedBooks() {
    return loanedBooks;
  }

  public void setLoanedBooks(List<Book> loanedBooks) {
    this.loanedBooks = loanedBooks;
  }

  // toString method to display data when printed
  public String toString() {
    String res = "User {";
    res += " ID: " + this.id;
    res += ", name: " + this.username;
    res += ", email: " + this.email;
    res += ", total loaned books: " + this.loanedBooks.size();

    return res + " }";
  }
}

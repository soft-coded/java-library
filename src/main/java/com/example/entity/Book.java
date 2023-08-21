package com.example.entity;

public class Book {
  private int id;
  private String title, author;

  // default constructor
  public Book() {
  }

  // parameterized constructor
  public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // toString implementation to display the data
  public String toString() {
    String res = "Book { ";
    res += "ID: " + this.id;
    res += ", title: " + this.title;
    res += ", author: " + this.author;

    return res + " }";
  }
}

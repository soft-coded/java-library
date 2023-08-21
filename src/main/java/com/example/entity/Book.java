package com.example.entity;

public class Book {
  private int id, quantity;
  private String title, author, description, publisher;
  private double price;

  // default constructor
  public Book() {
  }

  // parameterized constructor
  public Book(int id, String title, String author, String description, String publisher, double price, int quantity) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.quantity = quantity;
    this.description = description;
    this.publisher = publisher;
    this.price = price;
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

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // toString implementation to display the data
  public String toString() {
    String res = "Book { ";
    res += "ID: " + this.id;
    res += ", title: " + this.title;
    res += ", author: " + this.author;
    res += ", description: " + this.description;
    res += ", price: " + this.price;
    res += ", publisher: " + this.publisher;
    res += ", quantity: " + this.quantity;

    return res + " }";
  }
}

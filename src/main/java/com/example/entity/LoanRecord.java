package com.example.entity;

public class LoanRecord {
  private int id, bookId, userId;

  // default constructor
  public LoanRecord() {
  }

  // parameterized constructor
  public LoanRecord(int id, int bookId, int userId) {
    this.id = id;
    this.bookId = bookId;
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getBookId() {
    return bookId;
  }

  public void setBookId(int bookId) {
    this.bookId = bookId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  // toString implementation for displaying data
  public String toString() {
    String res = "LoanRecord { ";
    res += "ID: " + this.id;
    res += ", userId: " + this.userId;
    res += ", bookId: " + this.bookId;

    return res + " }";
  }
}

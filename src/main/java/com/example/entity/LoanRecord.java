package com.example.entity;

public class LoanRecord {
  private int id, bookId, userId;
  private String borrowDate, dueDate, returnDate;

  // default constructor
  public LoanRecord() {
  }

  // parameterized constructor
  public LoanRecord(int id,
      int bookId,
      int userId,
      String borrowDate,
      String dueDate,
      String returnDate) {
    this.id = id;
    this.bookId = bookId;
    this.userId = userId;
    this.borrowDate = borrowDate;
    this.returnDate = returnDate;
    this.dueDate = dueDate;
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

  public String getBorrowDate() {
    return borrowDate;
  }

  public void setBorrowDate(String borrowDate) {
    this.borrowDate = borrowDate;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public String getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(String returnDate) {
    this.returnDate = returnDate;
  }

  // toString implementation for displaying data
  public String toString() {
    String res = "LoanRecord { ";
    res += "ID: " + this.id;
    res += ", userId: " + this.userId;
    res += ", bookId: " + this.bookId;
    res += ", borrow date: " + this.borrowDate;
    res += ", due date: " + this.dueDate;
    res += ", return date: " + this.returnDate;

    return res + " }";
  }
}

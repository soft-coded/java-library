package com.example.entity;

public class User {
  private int id;
  private String name, email;

  // default constructor
  public User() {
  }

  // parameterized constructor
  public User(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // toString method to display data when printed
  public String toString() {
    String res = "User {";
    res += " ID: " + this.id;
    res += ", name: " + this.name;
    res += ", email: " + this.email;

    return res + " }";
  }
}

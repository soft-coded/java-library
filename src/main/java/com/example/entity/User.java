package com.example.entity;

public class User {
  private int id;
  private String name, email, role;

  // default constructor
  public User() {
  }

  // parameterized constructor
  public User(int id, String name, String email, String role) {
    this.id = id;
    this.name = name;
    this.email = email;
    /*
     * permitted role values:
     * - "user"
     * - "admin"
     * - "manager"
     */
    this.role = role.toLowerCase();
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

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
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

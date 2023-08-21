package com.example.entity;

public class User {
  private int id, contactNo;
  private String name, email, role, fullName, password;

  // default constructor
  public User() {
  }

  // parameterized constructor
  public User(int id, String name, String email, String role, String fullName, String password, int contactNo) {
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
    this.fullName = fullName;
    this.password = password;
    this.contactNo = contactNo;
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

  public int getContactNo() {
    return contactNo;
  }

  public void setContactNo(int contactNo) {
    this.contactNo = contactNo;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  // toString method to display data when printed
  public String toString() {
    String res = "User {";
    res += " ID: " + this.id;
    res += ", name: " + this.name;
    res += ", email: " + this.email;
    res += ", full name: " + this.fullName;
    res += ", password: " + this.password;
    res += ", contact number: " + this.contactNo;
    res += ", role: " + this.role;

    return res + " }";
  }
}

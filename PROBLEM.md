Develop library management system. This system has the following main use cases:

- generate default, parameterised constructors, getters & Setters, toString methods for all classes
- Allow users to interact with application using Scanner class

User

- list all books
- search a specific book based on
  book title (or) author (or) publisher
- borrow a book
- return a book
- Raise a request for new book

Admin

- can add, delete, list, update books info to/from library
- can add, delete,update & list users
- assign user as a library manager

Library Manager -

- can add, update, or delete books and loan records.
- order new books.
- update title, price, quantity of books
- view loan records

- Classes

Book-

- create private Fields
  id, title, description, price, author, publisher & quantity.

User -

- create private Fields
  id, username, fullName, contactNo, email, password, role

LoanReacord -

- create private Fields
  borrow date, due date, return date

packages -
com.example
Main.java
com.example.entity
Book, User, LoanRecord classes
com.example.service
Interfaces & Implementation classes for all entity classes
com.example.repository
Interfaces & Implementation classes for storing and retrieving information about users, books & loanRecords

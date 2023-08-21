package com.example;

import com.example.entity.*;
import com.example.service.*;
import java.util.*;

public final class App {
    public static void main(String[] args) {
        // initialise objects
        UserServiceImpl userService = new UserServiceImpl();
        BookServiceImpl bookService = new BookServiceImpl();
        LoanRecordServiceImpl loanRecService = new LoanRecordServiceImpl();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        // create a few users
        userService.addUser(
                new User(
                        rand.nextInt(4999) + 1, // id = random number between 1 to 5000
                        "shru",
                        "shru@gmail.com",
                        "admin",
                        "Shrutanten",
                        "shru@123",
                        123));

        userService.addUser(
                new User(
                        rand.nextInt(4999) + 1, // id = random number between 1 to 5000
                        "maha",
                        "maha@gmail.com",
                        "manager",
                        "Mahesh Dalla",
                        "mahesh@dalla",
                        456));

        userService.addUser(
                new User(
                        rand.nextInt(4999) + 1, // id = random number between 1 to 5000
                        "user",
                        "user@gmail.com",
                        "user",
                        "New User",
                        "user@123",
                        83492));

        // create a few books
        bookService.addBook(
                new Book(
                        rand.nextInt(4999) + 1,
                        "Harry Potter",
                        "J.K. Rowling",
                        "The harry potter book part 1",
                        "WB publications",
                        5999.99,
                        30));

        bookService.addBook(
                new Book(
                        rand.nextInt(4999) + 1,
                        "Lord of the rings",
                        "J.R.R. Tolkein",
                        "The lord of the rings book",
                        "ABCDE",
                        32918.3218,
                        10));

        bookService.addBook(
                new Book(
                        rand.nextInt(4999) + 1,
                        "Hobbit",
                        "Martin",
                        "The hobbit book",
                        "OIDS",
                        2938.329,
                        5));

        boolean repeat = true;
        int operation;

        while (repeat) {
            // display all the users
            System.out.println("Registered users:");
            for (User user : userService.getAllUsers()) {
                System.out.println(user.toString());
            }
            // print all the available books
            System.out.println("Books available:");
            for (Book book : bookService.getAllBooks()) {
                System.out.println(book.toString());
            }
            System.out.println();

            System.out.println(
                    "Select operation:\n1. Add user\n2. Delete user\n3. Add book\n4. Delete book\n5. Add record\n6. Delete record");
            operation = sc.nextInt();
            switch (operation) {
                case 1: {
                    // User(id, name, email, role, full name, password, contact)
                    int contact;
                    String name, email, role, fullName, password;

                    System.out.println("Enter username:");
                    name = sc.next();
                    System.out.println("Enter email:");
                    email = sc.next();
                    System.out.println("Enter role:");
                    role = sc.next();
                    System.out.println("Enter full name:");
                    fullName = sc.next();
                    System.out.println("Enter password:");
                    password = sc.next();
                    System.out.println("Enter contact number:");
                    contact = sc.nextInt();

                    User returnedUser = userService.addUser(
                            new User(
                                    rand.nextInt(4999) + 1,
                                    name, email, role, fullName, password, contact));

                    System.out.println("User added successfully: " + returnedUser.toString());
                    break;
                }

                case 3: {
                    // new Book(id, title, author, desc, publ, price, quantity)
                    String title, author, desc, pub;
                    double price;
                    int quantity;

                    System.out.println("Enter title:");
                    title = sc.nextLine();
                    System.out.println("Enter author:");
                    author = sc.nextLine();
                    System.out.println("Enter description:");
                    desc = sc.nextLine();
                    System.out.println("Enter publisher:");
                    pub = sc.nextLine();
                    System.out.println("Enter price:");
                    price = sc.nextDouble();
                    System.out.println("Enter quantity:");
                    quantity = sc.nextInt();

                    Book returnedBook = bookService.addBook(
                            new Book(
                                    rand.nextInt(4999) + 1,
                                    title,
                                    author,
                                    desc,
                                    pub,
                                    price,
                                    quantity));

                    System.out.println("Book added successfully: " + returnedBook);
                }

                case 5: {
                    /*
                     * LoanRecord(int id,
                     * int bookId,
                     * int userId,
                     * String borrowDate,
                     * String dueDate,
                     * String returnDate)
                     */

                    String boDate, dueDate, reDate;
                    int bookId, userId;

                    System.out.println("Enter the id of the book to be borrowed:");
                    bookId = sc.nextInt();
                    System.out.println("Enter the id of the user borrowing the book:");
                    userId = sc.nextInt();
                    System.out.println("Enter borrow date:");
                    boDate = sc.nextLine();
                    System.out.println("Enter due date:");
                    dueDate = sc.nextLine();
                    System.out.println("Enter return date:");
                    reDate = sc.nextLine();

                    LoanRecord rec = loanRecService.addLoanRecord(
                            new LoanRecord(rand.nextInt(4999) + 1, bookId, userId, boDate, dueDate, reDate));

                    System.out.println("Loan record added: " + rec.toString());
                }
                default:
                    break;
            }

            System.out.println("Repeat? (y/n)");
            char yN = sc.next().charAt(0);
            if (yN == 'n')
                repeat = false;
        }

        sc.close();
    }
}

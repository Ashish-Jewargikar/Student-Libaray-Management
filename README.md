Library Management System

This is a library management system built with Spring Boot and MySQL. It allows users to manage books, authors, and students, as well as issue and return books.
Features

    Add, edit, and delete books, authors, and students
    Issue and return books
    Send an email to students when they receive a book
    View transaction history

Requirements
    
    Spring boot Initiliser
    Java 11 or higher
    MySQL
    SMTP server (for email notifications)

Installation

    1.  Clone the repository to your local machine
    2.  Import the project into your preferred IDE
    3.  Configure the application properties in src/main/resources/application.properties to match your MySQL and SMTP server settings
    4.  Run the application using your IDE or with the command mvn spring-boot:run
    5.  Navigate to http://localhost:8080 in your web browser to access the application

Usage
Adding a book

    6.  Click on the "Books" tab in the navigation menu
    7.  Click on the "Add Book" button
    8.  Enter the book's details in the form and click "Submit"

Issuing a book

    9.  Click on the "Books" tab in the navigation menu
    10. Click on the "Issue" button next to the book you want to issue
    11. Enter the student's details in the form and click "Submit"

Returning a book

    12.  Click on the "Books" tab in the navigation menu
    13.  Click on the "Return" button next to the book you want to return
    14.  Enter the student's details in the form and click "Submit"

Viewing transaction history

    15.  Click on the "Transactions" tab in the navigation menu
    16.  Use the search bar to filter transactions by book, student, or date

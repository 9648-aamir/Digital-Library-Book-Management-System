# Digital Library Book Management System

## Overview
The **Digital Library Book Management System** is a simple Java-based application that allows librarians to efficiently manage books in a library. This system enables users to **add, update, search, delete, and view books** while keeping track of their availability status.

## Features
- **Add a Book**: Enter details such as Book ID, Title, Author, Genre, and Availability Status.
- **View All Books**: Display a list of all books with their details.
- **Search a Book**: Find books using their ID or Title.
- **Update a Book**: Modify book details like Title, Author, Genre, or Availability Status.
- **Delete a Book**: Remove a book from the system.
- **Exit System**: Close the program safely.

## Technologies Used
- **Programming Language**: Java
- **Data Storage**: Uses an in-memory list to manage books (ArrayList).
- **User Interface**: Console-based input and output.

## How to Run the Program
1. **Install Java**: Ensure that Java is installed on your system.
2. **Compile the Code**:
   ```sh
   javac Digital_Library/*.java
   ```
3. **Run the Program**:
   ```sh
   java Digital_Library.LibraryManagement
   ```
4. Follow the on-screen menu to manage books.

## Constraints
- Each **Book ID must be unique**.
- **Title and Author cannot be empty**.
- Availability Status must be either **'Available'** or **'Checked Out'**.

## Example Usage
```
Library Management System
1. Add Book
2. View All Books
3. Search Book
4. Update Book
5. Delete Book
6. Exit
Choose an option: 1
Enter Book ID: 101
Enter Title: Java Programming
Enter Author: James Gosling
Enter Genre: Education
Enter Availability (Available/Checked Out): Available
Book added successfully!
```

## Future Enhancements
- Implement a **database** for permanent storage.
- Add a **Graphical User Interface (GUI)**.
- Enable **user authentication** for security.

## Contributors
- **Aamir Shahab**




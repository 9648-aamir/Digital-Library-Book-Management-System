# Digital Library Book Management System

## 📖 Overview
The **Digital Library Book Management System** is a simple Java-based console application that enables librarians to efficiently manage books. The system allows users to add, view, search, update, and delete books from the catalog while maintaining their availability status.

## ✨ Features
- **Add a Book** – Input details like Book ID, Title, Author, Genre, and Availability Status.
- **View All Books** – Display the list of all available books.
- **Search Books** – Search books using Book ID or Title.
- **Update Book Details** – Modify book attributes such as Title, Author, Genre, and Availability Status.
- **Delete a Book** – Remove books from the catalog.
- **User-Friendly CLI Interface** – Lightweight and easy-to-use console-based application.

## 🛠 Setup & Installation

### **Prerequisites**
- Java Development Kit (JDK) 8 or higher installed.
- A command-line terminal (Command Prompt, PowerShell, or Terminal).

### **Steps to Set Up & Run the Application Using JAR File**

#### **1️⃣ Download the JAR File**
If you have received the prebuilt JAR file, place it in a dedicated folder.

#### **2️⃣ Open Command Line and Navigate to the Folder**
```sh
cd path/to/your/folder
```

#### **3️⃣ Run the Application**
```sh
java -jar DigitalLibrary.jar
```

### **Steps to Build JAR from Source Code**

#### **1️⃣ Clone the Repository**
```sh
 git clone https://github.com/yourusername/Digital-Library-Management.git
```

#### **2️⃣ Navigate to the Project Directory**
```sh
cd Digital-Library-Management
```

#### **3️⃣ Compile the Java Files**
```sh
javac -d out -cp src src/Digital_Library/*.java
```

#### **4️⃣ Create the Executable JAR File**
```sh
jar cfe DigitalLibrary.jar Digital_Library.LibraryManagement -C out .
```

#### **5️⃣ Run the Application**
```sh
java -jar DigitalLibrary.jar
```

## 🚀 Challenges Faced
During the development process, several challenges were encountered:
- **Handling Input Validation:** Ensuring Book ID uniqueness and checking non-empty fields for Title and Author.
- **Maintaining Data Without a Database:** The system currently stores books in a collection (ArrayList), which resets every time the program restarts.
- **Packaging the JAR Correctly:** Ensuring the correct **Main-Class** entry in the `MANIFEST.MF` file for proper execution.

## 🔄 Future Improvements
Given more time, the following enhancements could be made:
- **Database Integration:** Storing books in a database (MySQL, PostgreSQL) for persistent data storage.
- **Graphical User Interface (GUI):** Creating a user-friendly interface using JavaFX or Swing.
- **Web-Based Version:** Implementing a web-based solution using Spring Boot for scalability.

## 📝 License
This project is open-source and available under the **MIT License**.

---
📩 **For Contributions & Feedback:** Feel free to fork the project, create pull requests, or report issues!




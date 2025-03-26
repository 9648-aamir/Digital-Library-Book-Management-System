package Digital_Library;

import java.util.List;
import java.util.Scanner;

/**
 * The LibraryManagement class provides a console-based interface
 * for managing a digital library. It allows users to add, view,
 * search, update, and delete books within the library system.
 * 
 * This class interacts with the Library and Book classes to maintain
 * book records efficiently.
 * 
 * @author Aamir Shahab
 * @version 1.0
 * @since 2025
 */
public class LibraryManagement {

    /** Library instance to manage books */
    private static Library library = new Library();
    
    /** Scanner instance for user input */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main method to display menu options and handle user interactions.
     * Runs in a loop until the user chooses to exit.
     * 
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println();
            
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    /**
     * Adds a new book to the library by taking user input.
     * Ensures title and author are not empty and validates availability status.
     */
    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();
        
        if (title.isEmpty() || author.isEmpty() || (!availability.equals("Available") && !availability.equals("Checked Out"))) {
            System.out.println("Invalid input. Title and Author cannot be empty. Availability must be 'Available' or 'Checked Out'.");
            return;
        }

        if (library.addBook(new Book(bookID, title, author, genre, availability))) {
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Book ID must be unique!");
        }
    }

    /**
     * Displays all books available in the library.
     * Prints book details if books exist; otherwise, notifies that no books are available.
     */
    private static void viewAllBooks() {
        List<Book> books = library.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Details of Books:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    /**
     * Searches for a book by ID or title and displays its details.
     * Notifies the user if the book is not found.
     */
    private static void searchBook() {
        System.out.print("Enter Book ID or Title to search: ");
        String search = scanner.nextLine();
        Book book = library.searchBook(search);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    /**
     * Updates book details based on user input.
     * Allows modification of title, author, genre, and availability.
     */
    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String bookID = scanner.nextLine();
        System.out.print("Enter new Title (press Enter to keep current): ");
        String title = scanner.nextLine();
        System.out.print("Enter new Author (press Enter to keep current): ");
        String author = scanner.nextLine();
        System.out.print("Enter new Genre (press Enter to keep current): ");
        String genre = scanner.nextLine();
        System.out.print("Enter new Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();

        if (library.updateBook(bookID, title, author, genre, availability)) {
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book ID not found.");
        }
    }

    /**
     * Deletes a book from the library using the book ID.
     * Confirms deletion success or failure based on book existence.
     */
    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookID = scanner.nextLine();
        if (library.deleteBook(bookID)) {
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book ID not found.");
        }
    }
}

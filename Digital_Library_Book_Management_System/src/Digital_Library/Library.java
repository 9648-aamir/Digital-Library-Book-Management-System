package Digital_Library;

import java.util.ArrayList;
import java.util.List;

/**
 * The Library class manages a collection of books and provides methods
 * for adding, searching, updating, and deleting books.
 * 
 * This class ensures that each book has a unique ID and maintains a list
 * of books available in the digital library system.
 * 
 * @author Aamir Shahab
 * @version 1.0
 * @since 2025
 */
public class Library {

    /** List to store books in the library */
    private List<Book> books;

    /**
     * Default constructor that initializes an empty book list.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * Ensures that the book ID is unique before adding.
     * 
     * @param book The book object to be added
     * @return true if the book was added successfully, false if the book ID already exists
     */
    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getBookID().equals(book.getBookID())) {
                return false;
            }
        }
        books.add(book);
        return true;
    }

    /**
     * Retrieves the list of all books in the library.
     * 
     * @return A list of books available in the library
     */
    public List<Book> getAllBooks() {
        return books;
    }

    /**
     * Searches for a book by its ID or title.
     * 
     * @param searchTerm The book ID or title to search for
     * @return The book if found, otherwise null
     */
    public Book searchBook(String searchTerm) {
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(searchTerm) || book.getTitle().equalsIgnoreCase(searchTerm)) {
                return book;
            }
        }
        return null;
    }

    /**
     * Updates the details of an existing book.
     * Allows modification of title, author, genre, and availability status.
     * 
     * @param bookID       The unique identifier of the book to update
     * @param title        The new title (leave empty to retain current value)
     * @param author       The new author (leave empty to retain current value)
     * @param genre        The new genre (leave empty to retain current value)
     * @param availability The new availability status ("Available" or "Checked Out")
     * @return true if the book was updated successfully, false if the book ID was not found
     */
    public boolean updateBook(String bookID, String title, String author, String genre, String availability) {
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                if (!title.isEmpty()) book.setTitle(title);
                if (!author.isEmpty()) book.setAuthor(author);
                if (!genre.isEmpty()) book.setGenre(genre);
                if (availability.equals("Available") || availability.equals("Checked Out")) {
                    book.setAvailability(availability);
                }
                return true;
            }
        }
        return false;
    }

    /**
     * Deletes a book from the library using its book ID.
     * 
     * @param bookID The unique identifier of the book to be deleted
     * @return true if the book was deleted successfully, false if the book ID was not found
     */
    public boolean deleteBook(String bookID) {
        return books.removeIf(book -> book.getBookID().equals(bookID));
    }
}

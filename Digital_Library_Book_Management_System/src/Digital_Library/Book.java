package Digital_Library;

/**
 * Represents a book in the digital library system.
 * This class provides book details and allows modification of attributes.
 * 
 * @author Aamir Shahab
 * @version 1.0
 * @since 2025
 */
public class Book {

    /** Unique identifier for the book */
    private String bookID;
    
    /** Title of the book */
    private String title;
    
    /** Author of the book */
    private String author;
    
    /** Genre of the book */
    private String genre;
    
    /** Availability status of the book (Available/Checked Out) */
    private String availability;
    
    /**
     * Default constructor.
     */
    public Book() {
    	
    }

    /**
     * Parameterized constructor to initialize a book with details.
     * 
     * @param bookID       Unique identifier for the book
     * @param title        Title of the book
     * @param author       Author of the book
     * @param genre        Genre of the book
     * @param availability Availability status (Available/Checked Out)
     */
    public Book(String bookID, String title, String author, String genre, String availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    /**
     * Gets the book ID.
     * 
     * @return Book ID
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * Gets the title of the book.
     * 
     * @return Title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return Author of the book
     */
    public String getAuthor() {
        return author;
    }
    
    /**
     * Gets the genre of the book.
     * 
     * @return Genre of the book
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the availability status of the book.
     * 
     * @return Availability status (Available/Checked Out)
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title New title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author New author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the genre of the book.
     * 
     * @param genre New genre of the book
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    /**
     * Sets the availability status of the book.
     * 
     * @param availability New availability status (Available/Checked Out)
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * Returns a string representation of the book details.
     * 
     * @return Formatted book details
     */
    @Override
    public String toString() {
        return "Book ID: " + bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nAvailability: " + availability;
    }
}

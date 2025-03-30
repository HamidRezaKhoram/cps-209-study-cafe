package Q1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = null;

        try {
            // Load books and print details
            books = loadBooksFile();
            for (Book book : books) {
                book.print();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }

        System.out.println("EXPECTED:");
        System.out.println(
            "B123 Harry Potter and the Sorcerer's Stone  Author: J.K. Rowling Genre: Fantasy Copies: Branch 1: 20 Branch 2: 15 Branch 3: 10"
        );
        System.out.println(
            "B456 To Kill a Mockingbird  Author: Harper Lee Genre: Fiction Copies: Branch 1: 12 Branch 2: 8 Branch 3: 10"
        );
        System.out.println(
            "B789 The Great Gatsby  Author: F. Scott Fitzgerald Genre: Classic Copies: Branch 1: 5 Branch 2: 4 Branch 3: 3"
        );
        System.out.println(
            "B101 1984  Author: George Orwell Genre: Dystopian Copies: Branch 1: 10 Branch 2: 9 Branch 3: 7"
        );
        System.out.println(
            "B112 The Hobbit  Author: J.R.R. Tolkien Genre: Fantasy Copies: Branch 1: 30 Branch 2: 25 Branch 3: 20"
        );
    }

    // Load the information for all books from the books.txt file into an ArrayList of Book objects.
    public static ArrayList<Book> loadBooksFile() throws FileNotFoundException {
        // Solution should go here
    }

    // Use a Scanner to read one Book "record" from the file and create and return a Book object
    public static Book readNextBook(Scanner sc) {
        // Solution should go here
    }
}

class Book {

    private String bookId;
    private String bookTitle;
    private String authorName;
    private String genre;
    private ArrayList<Integer> copiesAvailable;

    // Getters and Setters
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCopiesAvailable(ArrayList<Integer> copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void print() {
        System.out.print(
            bookId +
            " " +
            bookTitle +
            "  Author: " +
            authorName +
            " Genre: " +
            genre +
            " Copies: "
        );
        for (int i = 0; i < copiesAvailable.size(); i++) {
            System.out.print(
                "Branch " + (i + 1) + ": " + copiesAvailable.get(i) + " "
            );
        }
        System.out.println();
    }
}

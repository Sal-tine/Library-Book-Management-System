package library;

import library.Book;
import library.Library;

/**
 * LibraryApp class to demonstrate the functionality of the library system
 */
public class LibraryApp {
	public static void main(String[] args) {
		/**
		 * create library
		 */
		Library library = new Library();
		
		/**
		 * add books
		 */
		Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0135166307", 40.99);
		Book book2 = new Book("Design Patterns", "Erich Gamma", "978-0201633610", 50.99);
        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", 45.99);
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        System.out.println("Adding books...\n");
        
        /**
         * searching for a book by ISBN
         */
        System.out.println("Searching for book wiht ISBN: 978-0135166307");
        Book foundBook = library.searchByISBN("978-0135166307");
        if (foundBook != null) {
        	System.out.println("Book found: " + foundBook);
        } else {
        	System.out.println("Book no found.");
        }
        
        /**
         *  Displaying all books in the library
         */
        System.out.println("\nAll books in the library:");
        library.displayBooks();

        /**
         *  Removing an existing book
         */
        System.out.println("\nRemoving book: " + book2);
        library.removeBook(book2);

        /**
         *  Displaying books after removal
         */
        System.out.println("\nAll books in the library after removal:");
        library.displayBooks();

        /**
         *  Trying to remove a book that does not exist
         */
        System.out.println("\nTrying to remove a non-existing book:");
        library.removeBook(book2); // This should print a message or do nothing.
        
        
        System.out.println("Searching for book wiht ISBN: 978-0201633610");
        Book foundBook2 = library.searchByISBN("978-0201633610");
        if (foundBook2 != null) {
        	System.out.println("Book found: " + foundBook);
        } else {
        	System.out.println("Book no found.");
        }
	}
}

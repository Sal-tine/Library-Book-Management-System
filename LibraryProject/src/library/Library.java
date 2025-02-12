package library;

public class Library {
	private Book[] Books;
	private int Count;
	
	/**Constructor initializing the book array and the count variable*/
	public Library() {
        Books = new Book[5];  // Fixed size of 5
        Count = 0;
    }
	/**Adds a book to the Books array and also increments count variable*/
	public boolean addBook(Book book) {
		if(Count < Books.length) {
			Books[Count++] = book; // Puts the new book in the next open space
			
			return true; // If there is a space to add book
		}
		
		return false; // When there is no space for the new book
	}
	
	/**Removes books from the Books array and decrements the count variable*/
	public boolean removeBook(Book book) {
		for (int i = 0; i < Count; i++) {
            if (Books[i].equals(book)) {
                Books[i] = Books[Count - 1]; // The book at the index is replaced with the last book in the array if there is one
                Books[Count - 1] = null; // The book used to replace the removal is NULL
                Count--; // Decrement count
                return true;
            }
        }
        return false;
	}
	
	/**Searches for the book in the Books array through the ISBN*/
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i <= Count; i++) {
			if (Books[i].getISBN().equals(ISBN)) { // The getISBN and equals commands from the book class comparing the books
                return Books[i];
            }
		}
		
		return null; // The book wasn't found
	}
	
	/**Prints every book in the Books array*/
	public void displayBooks() {
		for(int i = 0; i <= Count; i++) {
			System.out.println(Books[i].toString()); // Prints the books
		}
	}
}

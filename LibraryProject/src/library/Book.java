package library;


/** represents a book with a title, author, ISBN, and price */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**Default constructor. Initializes the book with unknown values and price 0.0*/

	public Book() {
		this.title = "Unkown";
		this.author = "Unkown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/** Parameterized constructor to initialize a book with specific details
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/** Copy constructor creates a new book 
	 * from details of the book given from another 
	 * @param other The other book to copy from */
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.ISBN = other.ISBN;
		this.price = other.price;
	}

	//all getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//End of getters and setters
	
	/** 
	 * Returns a string detailing the given book attributes
	 */
	@Override
	public String toString() {
		return title + " by " + author + "(ISBN: " + ISBN + ", $" + price + ")";
	}
	
	/** Compares ISBN between books */
	@Override 
	public boolean equals(Object other) {
		if (this == other) return true;
		if (other == null || getClass() != other.getClass()) return false;
		Book book = (Book) other;
		return this.getISBN().equals(book.getISBN());
	}
	
}



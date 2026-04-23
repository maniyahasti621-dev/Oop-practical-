class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    private int availableBooks;
    
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }
    
    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully. Books remaining: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available. Available: " + availableBooks + ", Requested: " + count);
        }
    }
    
    public int getAvailableBooks() {
        return availableBooks;
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library(3);
        System.out.println("Initial available books: " + library.getAvailableBooks());
        
        try {
            System.out.println("\nTrying to issue 2 books...");
            library.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTrying to issue 2 more books...");
            library.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

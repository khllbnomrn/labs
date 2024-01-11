import java.util.*;

public class test{
public static void main(String[] args)
 {
 Library lib = new Library("MedTech, Lac 2, Tunis");
 lib.addBook(new Book("The Da Vinci Code"));
 lib.addBook(new Book("Le Petit Prince"));
 lib.addBook(new Book("A Tale of Two Cities"));
 lib.addBook(new Book("The Lord of the Rings"));
 System.out.println("Library hours:");
 lib.printOpeningHours();
 System.out.println("Library address:");
 lib.printAddress();
 System.out.println("Borrowing The Lord of the Rings:");
 lib.borrowBook("The Lord of the Rings");
 System.out.println("Books available in the library:");
 lib.printAvailableBooks();
 System.out.println("Returning The Lord of the Rings:");
 lib.returnBook("The Lord of the Rings");
 System.out.println("Books available in the library:");
 lib.printAvailableBooks();
}
}
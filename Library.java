import java.util.*;

public class Library
{

String openinghours=" 9 AM to 5 PM";
String adress;
ArrayList<Book> Books= new ArrayList<Book>();

public Library(String adress)
{
    this.adress=adress;
}

public void printOpeningHours()
{
    System.out.println("Library opens daily from "+openinghours);
}

public void printAddress()
{
    System.out.println(adress);
}

public void addBook(Book book)
{
    Books.add(book);
}

public void returnBook(String title)
{
    int i=0;
    boolean found = false;
    while (i<Books.size())
    {
            if (Books.get(i).getTitle()==title)
        {
            if (Books.get(i).getBorrowed()==true){
                Books.get(i).setBorrowed(false);
                System.out.println("You successfully returned "+ title);     
            }else {System.out.println("Sorry, this book is not borrowed.");}
                found = true;           
        }
         i++;   
        }
        if (!found){System.out.println("Sorry, this book is not in our catalog.");}
}

public void borrowBook(String title)
{
    int i=0;
    boolean found = false;
    while (i<Books.size())
        {
            if (Books.get(i).getTitle()==title)
        {
            if (Books.get(i).getBorrowed()==false){
                Books.get(i).setBorrowed(true);
                System.out.println("You successfully borrowed "+ title);     
            }else {System.out.println("Sorry, this book is already borrowed.");}
                found = true;           
        }
         i++;   
        }
        if (!found){System.out.println("Sorry, this book is not in our catalog.");}
}

    public void printAvailableBooks()
    {
        for (int i=0; i<Books.size();i++)
        {
            if (Books.get(i).getBorrowed()==false)
                 System.out.println(Books.get(i).getTitle());
            
        }
    }

}
import java.util.*;

public class Book {

 private String title;
 private boolean borrowed;

public Book(String title)
{
    this.title=title;
    borrowed=false;
}

 public String getTitle()
 {
    return title;
 }

 public boolean getBorrowed()
 {
    return borrowed;
 }

 public void setBorrowed(boolean borrowed)
 {
 this.borrowed=borrowed;
 }


}
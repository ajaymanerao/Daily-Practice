package bookpkg;
import java.util.*;

public class Book{
private int bookId;
private String title;
private String author;
private double price;
private static final double discount =10.0;

public Book(int bookId, String title, String author, double price){
this.bookId= bookId;
this.title=title;
this.author=author;
this.price=price;
}

public  double getDiscountedPrice(){
return price-(price*discount/100);
}

public void displayBookDetails(){
System.out.println("Book ID : "+bookId);
System.out.println("Title   : "+title);
System.out.println("Author  : "+author);
System.out.println("Price   : "+price);
System.out.println("Discount : "+discount+"%");
}
}
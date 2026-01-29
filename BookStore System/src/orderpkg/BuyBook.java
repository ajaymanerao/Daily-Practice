package orderpkg;
import bookpkg.Book;
 
public class BuyBook{

public static void main(String [] args){
Book book=new Book(101, "Java Programming","Herbert Schildt", 500.0);
Order order=new Order(1, 501,"Ajay",2);
book.displayBookDetails();
order.calculateTotal(book.getDiscountedPrice());
order.displayOrderDetails(); 
}
}
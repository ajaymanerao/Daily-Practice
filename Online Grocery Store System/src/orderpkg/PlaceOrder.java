package orderpkg;

import productpkg.Product;

public class PlaceOrder{
public static void main(String [] args){
Product product=new Product(111001, "Sunscreem","beauty",450.0);
Order order=new Order(101, 141412, "Ajay", 5);
product.getProductDetails();
order.getOrderDeatils();
order.getTotalAmount(product.getDiscountedPrice());
}

}


//command
//cd "C:\Users\Ajay\Desktop\program file\VM\Online Grocery Store System"

//javac -d bin src\productpkg\Product.java src\orderpkg\Order.java src\orderpkg\PlaceOrder.java



//java -cp bin orderpkg.PlaceOrder


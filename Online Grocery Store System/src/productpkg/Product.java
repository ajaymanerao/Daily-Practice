package productpkg;

public class Product{
private int productId;
private String name;
private String category;
private double price;
private static final double discount=10;

public Product(int productId, String name, String category, double price){
this.productId=productId;
this.name=name;
this.category=category;
this.price=price;
} 

public double getDiscountedPrice(){
price=price-(price*discount/100);
return price;
}

public void getProductDetails(){
System.out.println("productId : "+productId);
System.out.println("name : "+name);
System.out.println("category : "+category);
System.out.println("price : "+price);
}
}
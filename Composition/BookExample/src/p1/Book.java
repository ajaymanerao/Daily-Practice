package p1;
public class Book{
private String name;
private double price;
private int qty;

private Author author;

public Book(String name, double price, int qty, Author author){
this.name=name;
this.price=price;
this.qty=qty;
this.author=author; //Author Class Data

}

public String getName(){
return name;
}

public Author getAuthor(){
return author;
}

public double getPrice(){
return price;
}

public int getQty(){
return qty;
}

public void setName(String name){
this.name=name;
}

public void setAuthor(Author author){
this.author=author;
}

public void setPrice(double price){
this.price=price;
}

public void setQty(int qty){
this.qty=qty;
}

public String toString(){
return name+" by "+author.toString();
}
}
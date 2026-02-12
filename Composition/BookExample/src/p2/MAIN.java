package p2;

import p1.Book;
import p1.Author;

public class MAIN{
public static void main(String [] args){
Author a1=new Author("Jmes Gosling","james@gmail.com",'M');
Book b1= new Book("JAVA", 288.50, 15, a1);
System.out.print(b1);
}
}


/*
cd C:\Users\Ajay\Desktop\VM\Composition\BookExample
cd src
javac -d ../bin p1\*.java p2\*.java
cd ..
java -cp bin p2.MAIN


*/
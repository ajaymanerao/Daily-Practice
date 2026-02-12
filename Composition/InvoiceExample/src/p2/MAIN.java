package p2;
import p1.*;

public class MAIN{
public static void main(String [] args){
Customer c1=new Customer(101,"Ajay",10);
Invoice i1=new Invoice(1001,c1,50000.0);
System.out.println(i1);
}
}



/*
C:\Users\Ajay\Desktop\VM\Composition\InvoiceExample\src

javac -d ../bin p1\*.java p2\*.java

cd ..

java -cp bin p2.MAIN

*/
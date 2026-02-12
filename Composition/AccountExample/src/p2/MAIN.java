package p2;

import p1.*;

public class MAIN{
public static void main(String [] args){
Customer c1= new Customer(101, "Ajay", 'm');

Account a1=new Account(1001,50000.0, c1);
System.out.println(a1);

a1.deposite(1000);
System.out.println("After Deposite: "+a1);

a1.Withdraw(2000);
System.out.println("After Withdraw: "+a1);

}
}
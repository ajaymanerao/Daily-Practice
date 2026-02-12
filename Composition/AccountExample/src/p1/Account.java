package p1;

public class Account{
private int id;
private double balance;

private Customer customer;

public Account(int id, double balance, Customer customer){
this.id=id;
this.balance=balance;
this.customer=customer;
}

public Account(int id, Customer customer){
this.id=id;
this.customer=customer;
this.balance=0.0;
}

public int getId(){
return id;
}

public Customer getCustomer(){
return customer;
}

public double getBalance(){
return balance;
}

public void setBalance(double balance){
this.balance=balance;
}

public String getCustomerName(){
return customer.getName();
}

public Account deposite(double amount){
balance+=amount;
return this;
}

public  Account Withdraw(double amount){
if(balance >= amount){
 balance-=amount;
}else{
System.out.println("Amount withdraw exceeds the current balance !");
}
return this;
}

public String toString() {
return customer.toString() +" balance=$" + balance;
}


}
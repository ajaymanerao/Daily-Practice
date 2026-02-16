abstract class BankAccount{
protected double balance;

public BankAccount(double balance){
this.balance=balance;
}

abstract void calculateInterest();


public String toString(){
return "Balance :"+balance;
}


}
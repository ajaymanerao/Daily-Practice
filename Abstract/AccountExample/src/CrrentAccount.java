class CrrentAccount extends BankAccount{

public CrrentAccount(double balance){
super(balance);
}

void calculateInterest(){
System.out.println("No Interest for currrent Account");
}

}
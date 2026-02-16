class SavingAccount extends BankAccount{
public SavingAccount(double balance){
super(balance);
}

void calculateInterest(){
double Interest =balance*0.05;
System.out.println("Saving Interest :"+Interest);
}


}
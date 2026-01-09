package Design_class_obj;

class Account{
    private int accountNumber;
    private double balance=0.0;
    
    
    Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    int getAccountNumber(){
        return accountNumber;
    }

    double getBalance(){
        return balance;
    }

    void setBalance(double amount){
        this.balance=amount;
    }

    void credit(double amount){
         balance +=amount;
    }

    void debit(double amount){
        if(balance>=amount){
             balance -=amount;
        }else{
            System.out.println("Account balance is  InSufficent");
        }   
    }

    void print(){
        System.out.println("A/C no: "+accountNumber +"  Balance= $"+balance);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Account A=new Account(123456789, 50000);
        //System.out.println(A.getAccountNumber()); 
        //System.out.println(A.getBalance());
        A.setBalance(45000);
        A.credit(10000);
        A.debit(5000);
        A.print();
    }
    
}

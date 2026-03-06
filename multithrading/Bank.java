package multithrading;

class Account{
    int balance=5000;
    public synchronized void Deposit(int amt){
        System.out.println("Deposite current Balance   "+this.balance);
        this.balance+=amt;
        System.out.println("Deposite updated Balance   "+this.balance);

    }
    public synchronized void Withdraw(int amt){
        System.out.println("Before withdraw current Balance   "+this.balance);
        if(amt>this.balance){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        this.balance-=amt;
        System.out.println("Deposite updated Balance   "+this.balance);

    }
}

class Ram extends Thread{
    private Account account;
    public Ram(Account account){this.account=account;}
    public void run(){
        account.Deposit(5000);
    }
}


class Shyam extends Thread{
    private Account account;
    public Shyam(Account account){this.account=account;}
    public void run(){
        account.Withdraw(10000);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a=new Account();
        Ram r1=new Ram(a);
        Shyam r2=new Shyam(a);
        r1.start();
        r2.start();

        
    }
    
}

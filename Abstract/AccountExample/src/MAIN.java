public class MAIN{
public static void main(String [] args){
BankAccount[] bankaccount=new BankAccount[2];

bankaccount[0]=new SavingAccount(100000);
bankaccount[1]=new CrrentAccount(200000);

for(BankAccount b : bankaccount){
System.out.println(b);
b.calculateInterest();
System.out.println("----------------------------------");

}
}
}
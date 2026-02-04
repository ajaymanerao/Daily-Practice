public class MAIN{
public static void main(String [] args){
Loan l1=new Loan();
Loan l2=new Loan(3.5,5,10000);
l2.getLoanDetails();
}
}

/*
command

C:\Users\Ajay\Desktop\VM\Polymorphism\RunTimePolymorphism\LOAN
javac MAIN.java
java MAIN


output:---

Annual InterestRate :3.5
Number Of Year :5
Loan Amount :10000.0
Loan Date :Thu Feb 05 00:53:44 IST 2026
Monthly Payment :181.91744970256332
Total Payment :10915.046982153799

*/

public class Loan{
private double annualInterestRate=2.5;
private int numberOfYears=1;
private double loanAmount=1000;
private java.util.Date loanDate;

Loan(){}

Loan(double annualInterestRate, int numberOfYears, double loanAmount){
this.annualInterestRate=annualInterestRate;
this.numberOfYears=numberOfYears;
this.loanAmount=loanAmount;
loanDate=new java.util.Date(); 
}

public double getAnnualInterestRate(){
return annualInterestRate;
}

public int getNumberOfYears(){
return numberOfYears;
}

public double getLoanAmount(){
return loanAmount;
}

public java.util.Date getLoanDate(){
return loanDate;
}

public void setAnnualInterestRate(double annualInterestRate){
this.annualInterestRate=annualInterestRate;
}

public void setNumberOfYears(int numberOfYears){
this.numberOfYears=numberOfYears;
}

public void setLoanAmount(double loanAmount){
this.loanAmount=loanAmount;
}

public double getMonthlyPayment(){
double monthlyInterestRate=annualInterestRate/1200;
return loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate, numberOfYears*12)));
}

public double getTotalPayment(){
return getMonthlyPayment() * numberOfYears * 12;
}

public void getLoanDetails(){
System.out.println("Annual InterestRate :"+annualInterestRate);
System.out.println("Number Of Year :"+numberOfYears);
System.out.println("Loan Amount :"+loanAmount);
System.out.println("Loan Date :"+loanDate);
System.out.println("Monthly Payment :"+getMonthlyPayment());
System.out.println("Total Payment :"+getTotalPayment());
}
}





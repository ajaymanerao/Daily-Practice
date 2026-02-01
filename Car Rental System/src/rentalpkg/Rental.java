package rentalpkg;

public class Rental{
private int rentalId;
private int customerId;
private String customerName;
private int numberOfDays;
private double totalRentalAmountPayable;


public Rental(int rentalId, int customerId, String customerName, int numberOfDays){
this.rentalId=rentalId;
this.customerId=customerId;
this.customerName=customerName;
this.numberOfDays=numberOfDays;
}

public double gettotalRentalAmountPayable(double price){
totalRentalAmountPayable= numberOfDays*price;
return totalRentalAmountPayable;
}

public void getRentalDetails(){
System.out.println("rentalId : "+rentalId);
System.out.println("customerId : "+customerId);
System.out.println("customerName : "+customerName);
System.out.println("numberOfDays : "+numberOfDays);
System.out.println("totalAmountPayable : "+totalRentalAmountPayable);
}
}
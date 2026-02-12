package p1;

public class Invoice{
private int id;
private double amount;
private Customer customer;

public Invoice(int id, Customer customer, double amount){
this.id=id;
this.customer=customer;
this.amount=amount;
}

public int getId(){
return id;
}

public Customer getCustomer(){
return customer;
}

public void setCustomer(Customer customer){
this.customer=customer;
}

public double getAmount(){
return amount;
}
	
public void setAmount(double amount){
this.amount=amount;
}

public String getCustomerName(){
return customer.getName();
}

public double getAmountAfterDiscount(){
amount=(amount*customer.getDiscount()/100);
return amount;
}

public String toString(){
return "Invoice id:"+id+" "+customer.toString()+" "+amount;
}

}

package orderpkg;

public class Order{
private int orderId;
private int custId;
private String custName;
private int quantity;
private double totalAmount;


public Order(int orderId, int custId, String custName, int quantity){
this.orderId=orderId;
this.custId=custId;
this.custName=custName;
this.quantity=quantity;
}

public void calculateTotal(double price){
this.totalAmount =quantity*price;
}

public void displayOrderDetails(){
System.out.println("Order ID     : " + orderId);
System.out.println("Customer ID  : " + custId);
System.out.println("Customer Name: " + custName);
System.out.println("Quantity     : " + quantity);
System.out.println("Total Amount : " + totalAmount);
}
}
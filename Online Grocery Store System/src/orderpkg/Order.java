package orderpkg;

public class Order{
private int orderId;
private int customerId;
private String customerName;
private int quantity;
private double totalAmount;

public Order(int orderId, int customerId, String customerName, int quantity){
this.orderId=orderId;
this.customerId=customerId;
this.customerName=customerName;
this.quantity=quantity;
}

public double getTotalAmount(double price){
totalAmount=quantity*price;
return totalAmount;
}

public void getOrderDeatils(){
System.out.println("orderId : "+orderId);
System.out.println("customerId : "+customerId);
System.out.println("quantity : "+quantity);
System.out.println("totalAmount : "+totalAmount);
}

}
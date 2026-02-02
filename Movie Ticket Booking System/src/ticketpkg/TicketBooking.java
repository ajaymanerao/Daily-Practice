package ticketpkg;

public class TicketBooking{
private int bookingId;
private int customerId;
private String customerName;
private int numberOfTicket;
private double totalAmount;

public TicketBooking(int bookingId, int customerId, String customerName, int numberOfTicket){
this.bookingId=bookingId;
this.customerId=customerId;
this.customerName=customerName;
this.numberOfTicket=numberOfTicket;
}

public double getTotalAmount(double discountedPrice){
totalAmount= numberOfTicket * discountedPrice;
return totalAmount;
}

public void getTicketBookingDetails(){
System.out.println("bookingId : "+bookingId);
System.out.println("customerId : "+customerId);
System.out.println("customerName : "+customerName);
System.out.println("numberOfTicket : "+numberOfTicket);
System.out.println("totalAmount : " +totalAmount);
}
}
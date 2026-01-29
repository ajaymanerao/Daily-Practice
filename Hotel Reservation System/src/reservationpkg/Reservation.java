package reservationpkg;

public class Reservation{
private int reservationId;
private int customerId;
private String customerName;
private int numberOfNights;
private double totalAmount;

public Reservation(int reservationId, int customerId, String customerName, int numberOfNights){
this.reservationId=reservationId;
this.customerId=customerId;
this.customerName=customerName;
this.numberOfNights=numberOfNights;
}

public void calculateTotalAmount(double discountedRate)
{
 totalAmount = numberOfNights * discountedRate;
}

public void displayReservationDeatils(){
System.out.println("reservationId : "+reservationId);
System.out.println("customerId : "+customerId);
System.out.println("customerName : "+customerName);
System.out.println("numberOfNight : "+numberOfNights);
System.out.println("totalAmount : "+totalAmount);

}
}
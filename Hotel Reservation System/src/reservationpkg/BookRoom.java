package reservationpkg;


import roompkg.Room;

public class BookRoom{

public static void main(String [] args){

Room r1=new Room(201,"Double", 6000);
Reservation res1=new Reservation(123456, 1001, "Ajay", 5);
r1.getroomDetails();
res1.calculateTotalAmount(r1.getDiscountedRate());
res1.displayReservationDeatils();
}
} 
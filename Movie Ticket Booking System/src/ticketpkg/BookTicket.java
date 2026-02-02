package ticketpkg;

import moviepkg.Movie;

public class BookTicket{

public static void main(String [] arge){
Movie m1=new Movie(123456,"Shivaji The Boss","Action", 200.0);
TicketBooking t1=new TicketBooking(10001, 11101, "Ajay", 5);
m1.displayMovieDetails();
t1.getTotalAmount(m1.getDiscountedPrice());
t1.getTicketBookingDetails();
}

}
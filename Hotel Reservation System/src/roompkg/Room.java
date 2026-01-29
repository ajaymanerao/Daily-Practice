package roompkg ;

public class Room{
private int roomNumber;
private String roomType;
private int ratePerNight;
private static final double discount=10.0;

public Room(int roomNumber,String roomType, int ratePerNight){
this.roomNumber=roomNumber;
this.roomType=roomType;
this.ratePerNight=ratePerNight;
}

public double getDiscountedRate(){
return ratePerNight -(ratePerNight * discount/100);
}

public void getroomDetails(){
System.out.println("roomNumber : "+roomNumber);
System.out.println("RoomType  : "+roomType);
System.out.println("ratePerNight : "+ratePerNight);
System.out.println("discount : "+discount+"%");
}
}
package rentalpkg;

import carpkg.Car;

public class RentCar{

public static void main(String[] args){
Car car=new Car(12231, "Petrol", "BMW 550d", 2000.0);
Rental rental=new Rental(1001, 101, "Ajay", 10); 
car.getCarDetails(); 
rental.gettotalRentalAmountPayable(car.getDiscountedPrice());
rental.getRentalDetails();

 
 
}
}


/**

Run command

C:\Users\Ajay\Desktop\program file\VM\Car Rental System

javac -d ..\bin carpkg\Car.java rentalpkg\Rental.java rentalpkg\RentCar.java

java -cp ..\bin rentalpkg.RentCar




*/
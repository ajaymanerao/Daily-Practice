package carpkg;


public class Car{
private int carId;
private String mode;
private String brand;
private double rentalPricePerDay;
private static final double discount=10.0;

public Car(int carId, String mode, String brand, double rentalPricePerDay){
this.carId=carId;
this.mode=mode;
this.brand=brand;
this.rentalPricePerDay=rentalPricePerDay;
}

public double getDiscountedPrice(){
 return rentalPricePerDay - (rentalPricePerDay * discount / 100);
}

public void getCarDetails(){
System.out.println("CarId : "+carId);
System.out.println("mode : "+mode);
System.out.println("brand : "+brand);
System.out.println("rentalPricePerDay : "+rentalPricePerDay);
}
}
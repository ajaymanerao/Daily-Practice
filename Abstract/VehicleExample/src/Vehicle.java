abstract class Vehicle{
protected  String brand;

public Vehicle(String brand){
this.brand=brand;
}

abstract void start();
abstract void stop();

public String toString(){
return "Brand :"+brand;

}
}
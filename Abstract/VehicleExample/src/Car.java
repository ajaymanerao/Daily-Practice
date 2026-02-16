class Car extends Vehicle{
public Car(String brand){
super(brand);
}

void start(){
System.out.println("Car Is Start with key");
}

void stop(){
System.out.println("Car is Stop with break");
}

public String toString(){
return "Car ["+super.toString() + "]";
}
}
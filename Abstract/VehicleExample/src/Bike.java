class Bike extends Vehicle{
public Bike(String Brand){
super(Brand);
}

void start(){
System.out.println("Bike start with self button");
}

void stop(){
System.out.println("Bike stop with hand brake");
}

public String toString(){
return "Bike ["+super.toString()+"]";
}


}
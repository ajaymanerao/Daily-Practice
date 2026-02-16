public class MAIN{

public static void main(String[] args){
Vehicle[] vehicle=new Vehicle[2];
vehicle[0]=new Car("Tyota");
vehicle[1]=new Bike("Honda");

for(Vehicle v :vehicle){
System.out.println(v);
v.start();
v.stop();
System.out.println("-----------------------------");

}
}
}
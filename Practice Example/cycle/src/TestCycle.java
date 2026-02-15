public class TestCycle{

public static void ride(Cycle c){
c.ride();
}


public static void main(String [] args){

Cycle c1 = new Unicycle();
Cycle c2 = new Bicycle();
Cycle c3 = new Tricycle();
ride(c1);
ride(c2);
ride(c3);
 
Cycle cycles[]=new Cycle[3];
cycles[0]=new Unicycle();
cycles[1]=new Bicycle();
cycles[2]=new Tricycle();

for(Cycle c: cycles){
c.ride();
}

}
}
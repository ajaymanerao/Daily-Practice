public class PlayerTest{


public static void main(String [] args){
Player p1=new Player("David Warner", 35, "Male", 5, "best", "A");
Player p2=new Player("Steve Smith", 36, "Male", 10, "good", "B");
p1.displayDetails("TestMatch");

System.out.println("--------------------------------------------------");

p1.displayDetails("WorldCup");


System.out.println("--------------------------------------------------");
System.out.println("--------------------------------------------------");
System.out.println("--------------------------------------------------");
p2.displayDetails("TestMatch");

System.out.println("--------------------------------------------------");

p2.displayDetails("WorldCup");

}


}
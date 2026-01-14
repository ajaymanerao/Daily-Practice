import java.util.*;
interface client{
    void input();
    void output();
}
class Raju implements client{
    String name;
    int salary;

    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name= sc.nextLine();
        System.out.println("Enter the salary");
        salary=sc.nextInt();

    }
    public void output(){
        System.out.println(name+" "+salary);

    }
}
public class Interface {

    public static void main(String [] args){
        client c=new Raju();
        c.input();
        c.output();
    }
    
}

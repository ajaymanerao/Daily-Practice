package Function;
import java.util.*;

// Calling static method (call without using object || call using class name)


class Addition {
    static void calculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }  
}


// Calling Non static method (call using object)

class Addition1 {
    void calculateSum(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }  
}


public class Sum {
    public static void main(String[] args) {
        
        Addition.calculateSum(); // static method call using class name

        Addition1 ad=new Addition1(); // Non static method call the method using creating the object
        ad.calculateSum();
         
        
    }
    
}

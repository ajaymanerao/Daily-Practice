import java.util.*;
// class Super{
//     int a,b,c;
     
//     void show(){
//         a=10; b=20; 
//         c=a+b;
//     System.out.println("Add: "+c);
//     }
// }
// class Sub1 extends Super{
//     int z;
//     void show1(){
//         a=50; b=30;
//         c=a-b;
        
//         System.out.println("Sub: "+b);
//     }


// }
// class Sub2 extends Sub1{
//  void show2(){
//     a=10;
//     b=10;
//     c=a*b;
//     z=10;
//     System.out.println("Mul: "+c);
//     System.out.println(c+z);

//  }
// }


class X{
    int a=10;
    void show(){
        System.out.println("Hello Ajay");
    }
}
 class Y extends X{
    int a=20;
    void show(){
        super.show();
        System.out.println(a);
        System.out.println("Hello Mayur");
        System.out.println(super.a);
    }
    

 }

public class Inheritance {
    public static void main(String[] args)  {
        //Super s = new Super();
        // Sub s2= new Sub();
        // s2.show();
        // s2.show1();

        //b Super s= new Super();
        // Sub2 s1= new  Sub2();
        // s1.show();
        // s1.show1();
        // s1.show2();
        Y b1= new Y();
        //b1.show();
        b1.show();
    }
    
}

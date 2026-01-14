// class Ajay{
//     int a,b;
//       Ajay(){
//         a=10;
//         b=20;

//     }
//     Ajay(Ajay ref){
//         a=ref.a;
//         b=ref.b;

//     }
//     void Des(){
//         System.out.print(a+b);
//     }
// }


// class A extends Thread{
//     int a; double b; String c;
//     A(){
//         System.out.println("default constructor");
//     }
//     A(int x){
//         try{
//         a=x;
//         System.out.println(x+5);
//         Thread.sleep(5000);
//         }catch(Exception e){

//         }
//     }
//     A(double y, String z){
//         b=y;
//         c=z;
//         System.out.println(y+" "+z);
//     }
// }


class A{
    static{  //Ststic Block
        System.out.println("Hi myself Ajay Anerao");
    }
    {  //Instance Block
        System.out.println("Hi myself Vijay");
    }
    A(){
        System.out.println("Hi myself Sanjay");
    }
}

public class OOP {
    public static void main(String [] args){
        // Ajay a=new Ajay();
        // a.Des();

        // A s1= new A();
        // A s2= new A(10);
        // A s3= new A(20.10, "Ajay");
        A r=new A();
    }
    
}

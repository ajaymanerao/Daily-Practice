// class Animal{
//     void eat(){
//         System.out.println("Eat Anythings");
//     }

// }
// class Deer extends Animal{
//     void eat(){
//         super.eat();
//         System.out.println("eat grass");

//     }
// }

class Encapsulation{
    private int value;

    public void setValue(int x){
        value=x;

        
    }

    public int getValue(){
        return value;
    }
}





public class Polymorphism {

    // void add(){
    //     int a=10, b=20, c;
    //     c=a+b;
    //     System.out.println(c);
    // }
    
    // void add(int x, int y){
    //     int c;
    //     c=x+y;
    //     System.out.println(c);
    // } 
    //   void add(double x, double y){
    //     double c;
    //     c=x+y;
    //     System.out.println(c);
    // }

    public static void main(String [] args){
        // Polymorphism p= new Polymorphism();
        // p.add();
        // p.add(5,10);
        // p.add(12.5,12.5);

        // Animal a= new Deer();
        // a.eat();
        Encapsulation e= new Encapsulation();
        e.setValue(1000);
        System.out.println(e.getValue());

        
    }
}

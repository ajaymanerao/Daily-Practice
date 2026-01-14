import java.util.*; 
//class Student{
//     String name;
//     int rollnumber;
//     String grade;
//     Student(String name, int rollnumber, String grade){
//      this.name=name;
//      this.rollnumber=rollnumber;
//      this.grade=grade;
//     }
//     void show(){
//         System.out.println(name);
//         System.out.println(rollnumber);
//         System.out.println(grade);
//     }
// }




// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(int length, int breadth){
//         this.length=length;
//         this.breadth=breadth;
//     }
//     void show(){
//         System.out.println(length*breadth);
//     }
// }




// class Circle{
//     double radius;
//     Circle(double radius){
//         this.radius=radius;
//     }

//     void Area(){
//         System.out.println("Area of circle: "+radius*radius);
//     }
//     void Circumference(){
//         System.out.println("Circumference is: "+ 2*Math.PI*radius);
//     }
// }



// class Vechical{
//     String Brand;
//     int Speed;
//     Vechical(String Brand, int Speed){
//       this.Brand=Brand;
//       this.Speed=Speed;  
//     }
//     void display(){
//         System.out.println("Brand :"+Brand);
//         System.out.println("Speed :"+Speed);
//     }
// }
// class Car extends Vechical{
//     String Model;
//     String Fuel;
// Car(String Brand, int Speed, String Model, String fule ){
//     super(Brand, Speed);
//     this.Model=Model;
//     this.Fuel=Fuel;
// }
// void Displaycar(){
//     display();
//     System.out.println("Model :"+Model);
//     System.out.println("FuleType :"+Fuel);
// }


// class BankAccount{
//     String Name;
//     int Balance;
//     BankAccount(String Name, int Balance){
//         this.Name=Name;
//         this.Balance=Balance;
//     }
//     void Deposit(double amount){
//         Balance +=amount;
//         System.out.println(Balance);
//     }
//     void WithDraw(double amount){
//         if (Balance>=amount) {
//              Balance-=amount;
//              System.out.println(Balance);            
//         }else{
//             System.out.println("Insufficient Balance");
//         }
//     }
//     void CheckBalance(){
//         System.out.println(Balance);
//     }
// }


 interface Shape{
double area();
double perimeter();   
}
class Square implements Shape{
    double side;

    Square(double side){
        this.side=side;
    }
    public double area(){
        return side*side;
    }

    public double perimeter(){
        return 4*side;
    }
}
class Triangle implements Shape{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area(){
          double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimeter(){
        return a+b+c;
    }
}
    







public class PracticeOOP {
    public static void main(String[] args) {
        // Student s=new Student("Ajay", 101, "A");
        // s.show();
        // Scanner sc= new Scanner(System.in);
        // int a= sc.nextInt();
        //int b= sc.nextInt();
        // Rectangle r= new Rectangle(a,b);
        // r.show();;
        // Circle c= new Circle(a);
        // c.Area();
        // c.Circumference();

        // Car c= new Car("TYota",105, "Frtuner","Diesel");
        // c.Displaycar();
         
        // BankAccount b= new BankAccount("Ajay",5000);
        // b.Deposit(5000);
        // b.WithDraw(200);
        // b.CheckBalance();

        Shape sh= new Square(5);
        Shape sh1=new Triangle(10, 05, 06);
        sh.area();
        sh.perimeter();
        sh1.area();
        sh1.perimeter();
        System.out.println(sh.area());
        System.out.println(sh.perimeter());
        System.out.println(sh1.area());
        System.out.println(sh1.perimeter());



    }
    
}

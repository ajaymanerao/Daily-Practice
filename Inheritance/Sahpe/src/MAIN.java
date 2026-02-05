public class MAIN{
public static void main(String args[]){

Shape s1= new Shape("blur", true);
s1.display();

Shape s2=new Circle(5.0, "blue", true);
s2.display();

Shape s3=new Rectangle(4.0, 6.0, "green", false);
s3.display();

Shape s4=new Square(3.0,"yello", true);
s4.display();

Square sq=new Square(5.0);
sq.display();

}
}
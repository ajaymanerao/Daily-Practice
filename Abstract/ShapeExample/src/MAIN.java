public class MAIN{

public static void main(String args[]){

Shape[] shapes = new Shape[4];

shapes[0] = new Circle(5.0, "blue", true);
shapes[1] = new Rectangle(4.0, 6.0, "green", false);
shapes[2] = new Square(3.0, "yellow", true);
shapes[3] = new Square(5.0);

for(int i=0;i<shapes.length;i++){
System.out.println(shapes[i]);


}

}
}
public class Circle extends Shape{
private double radius=1.0;

public Circle(){}
public Circle(double radius){
this.radius=radius;
}

public Circle(double radius, String color, boolean filled){
super(color, filled);
this.radius=radius;
}

public double getRadius(){
return radius;
}

public void setRadius(double radius){
this.radius=radius;
}

public double getArea(){
return 3.14*(radius*radius);
}

public double getPerimeter(){
return 2 * 3.14 * radius;
}

void display(){
System.out.println();
System.out.println("---------Circle------------------");
System.out.println("color :"+getColor());
System.out.println("filled :"+isFilled());
System.out.println("radius :"+radius);
System.out.println("Area :"+getArea());
System.out.println("Permiter :"+getPerimeter());
}
}
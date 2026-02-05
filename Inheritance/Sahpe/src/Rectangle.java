public class Rectangle extends Shape{
private double width=1.0;
private double length=1.0;

public Rectangle(){}
public Rectangle(double width, double length){
this.width=width;
this.length=length;
}

public Rectangle(double width, double length, String color, boolean filled){
super(color, filled);
this.width=width;
this.length=length;
}

public double getWidth(){
return width;
}

public void setWidth(double width){
this.width=width;
}

public double getlength(){
return length;
}

public void setlength(double length){
this.length=length;
}

public double getArea(){
return length*width;
}

public double getPerimeter(){
return 2 * (width + length);
}
 
void display(){
System.out.println();
System.out.println("--------Rectangle----------------------");
System.out.println("width :"+width);
System.out.println("length :"+length);
System.out.println("color :"+getColor());
System.out.println("filled :"+isFilled());
System.out.println("Area :"+getArea());
System.out.println("Perimeter :"+getPerimeter());
}
}
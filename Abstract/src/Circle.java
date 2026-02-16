class Circle extends Shape{
protected double radius=1.0;

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

public String toString() {
return "-------------------------Circle:----------------------------------\n" +
               "Radius : " + radius + "\n" +
               "Color : " + getColor() + "\n" +
               "Filled : " + isFilled() + "\n" +
               "Area : " + getArea() + "\n" +
               "Perimeter : " + getPerimeter();
}
}
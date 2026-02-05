public class Square extends Rectangle{
public Square(){}

public Square(double side){
super(side,side);
}

public Square(double side, String color, boolean filled){
super(side, side, color, filled);
}

public double getSide(){
return getWidth();
}

public void setSide(double side){
setWidth(side);
setLength(side);
}

public void setWidth(double side){
setSide(side);
}

public void setLength(double side){
setSide(side);
}


void display(){
System.out.println();
System.out.println("-------Square-----------------------");
System.out.println("Square side :"+getSide());
System.out.println("color :"+getColor());
System.out.println("filled :"+isFilled());
System.out.println("Area : " + getArea());
System.out.println("Perimeter : " + getPerimeter());
}
}
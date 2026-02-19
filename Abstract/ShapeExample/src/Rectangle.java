class Rectangle extends Shape{
protected double width=1.0;
protected double length=1.0;

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
 
public String toString() {
    return "---------------------------Rectangle:------------------------------\n" +
           "Length : " + length + "\n" +
           "Color : " + getColor() + "\n" +
           "Filled : " + isFilled() + "\n" +
           "Area : " + getArea() + "\n" +
           "Perimeter : " + getPerimeter();
}
}
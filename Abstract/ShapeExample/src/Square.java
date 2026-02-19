class Square extends Rectangle{
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

public String toString() {
    return "-----------------------Square Details:-------------------------------\n" +
           "Square side : " + getSide() + "\n" +
           "Color : " + getColor() + "\n" +
           "Filled : " + isFilled() + "\n" +
           "Area : " + getArea() + "\n" +
           "Perimeter : " + getPerimeter();
}
}
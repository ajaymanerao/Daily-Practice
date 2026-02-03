class Circle{
private double radius=1.0;
private String color ="red";

Circle(){
}

Circle(double radius){
this.radius=radius;
}

Circle(double radius, String color){
this.radius=radius;
}

public double getRadius(){
return radius;
}

public void setRadius(double radius){
this.radius=radius;
}

public String getColor(){
return color;
}

public  void setColor(String color){
this.color=color;
}

public double getArea(){
return 3.14*(radius*radius); 
}
}


}
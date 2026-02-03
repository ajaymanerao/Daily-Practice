class Cylinder extends Circle{
private double hight=1.0;

Cylinder(){

}

Cyclinder(double radius){
super(radius);
}

Cyclinder(double radius, double hight){
super(hight);
this.height;
}

Cyclindre(double radius, double height, String color){
super(radius, color);
this.height=height;
}

public double getHeight(){
return hight;

}

public void setHeight(double height){
this.height;
}

public double getVolume(){
return 2*3.14*(radius*radius)*height;
}

}

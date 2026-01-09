package Design_class_obj;
class Circle{
    private double radius=1.0;
    private String color="red";

    Circle(){

    }
    Circle(double r){
        radius=r;
    }

    Circle(double r, String c){
        radius=r;
        color=c;
    }

    double getRadius(){
        return radius;
    }

    String getColor(){
        return color;
    }

    double getArea(){
        return 3.14*(radius*radius);
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1=new Circle(2.0,"blue");
        System.out.println("radius "+c1.getRadius());
        System.out.println("color "+c1.getColor());
        System.out.println("Area "+c1.getArea());
        c1.getArea();
        System.out.println("-----------------------");

        Circle c2=new Circle(2.0);
        System.out.println("radius "+c2.getRadius());
        System.out.println("color "+c2.getColor());
        System.out.println("Area "+c2.getArea());
        System.out.println("-----------------------");

        Circle c3=new Circle();
        System.out.println("radius "+c3.getRadius());
        System.out.println("color "+c3.getColor());
        System.out.println("Area "+c3.getArea());


    }
    
}

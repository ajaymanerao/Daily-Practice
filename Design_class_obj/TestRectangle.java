package Design_class_obj;

class Rectangle{
    private float length=1.0f;
    private float width=1.0f;

    Rectangle(){}

    Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    float getLength(){
        return length;
    }

    void setLength(float length){
        this.length=length;
    }

    float getWidth(){
        return width;
    }

    void setWidth(float width){
        this.width=width;
    }

    double getArea(){
        return this.length*this.width;
    }

    double getPerimeter(){
        return 2*(this.length+this.width);
    }

    public String toString(){
        return "Rectangle [length="+this.length+", Width="+this.width+"]";
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(12.4f, 9.4f);
        r.setLength(12.5f);
        r.setWidth(8.4f);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
        System.out.println(r);
        
    }
    
}

package Design_class_obj;

class Point{
    private int x=0;
    private int y=0;
    Point(){

    }
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    int getX(){
        return x;
    }

    void setX(int x){
        this.x=x;
    }

    int getY(){
        return y;
    }
    void SetY(int y){
        this.y=y;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    int[] getXY(){
     return new int[]{x,y};
    }

    void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    double distance(int x, int y){
        int dx=this.x-x;
        int dy=this.y-y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    double distance(Point another){
        int dx=this.x-another.x;
        int dy=this.y-another.y;
        return Math.sqrt(dx*dx+dy*dy);

    }

    double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }

}

public class TestPoint {
    public static void main(String[] args) {
        Point p1=new Point(3,4);
        Point p2=new Point(6, 9);
        p1.setX(10);
        p1.SetY(20);
        int[] xy=p1.getXY();
        System.out.println("XY: "+ xy[0]+","+xy[1]);
        p1.setXY(5, 6);
        System.out.println(p1);
        System.out.println(p1.distance(8, 4));
        System.out.println(p1.distance(p2)); 
        System.out.println(p1.distance());  
    }
    
}

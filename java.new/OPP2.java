class XYZ{
    int a=10;
    void show(){
        System.out.println("HI Ajay, How are you?");

    }

    class Y extends XYZ{
        int a=5;
        void show(){
            System.out.println(a);
            System.out.println(super.a);
            System.out.println(super.a);
            System.out.println("Hi Mayur, How are you");
        }
    }
}


public class OPP2 {
    public static void main(String [] args){
        Y y= new Y();
        y.show();
    }

    
}

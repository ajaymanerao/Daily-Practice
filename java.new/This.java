public class This {
    // void show(){
    //     System.out.println(this);

    // }


    This(){
        this(10);
        System.out.println("Hi Ajau");

    }
    This(int a){
        System.out.println(a+10);
        System.out.println("Hi Vijay");

    }


    public static void main(String [] args){
        This t= new This();
        // System.out.println(t);
        // t.show();

    }
    
}

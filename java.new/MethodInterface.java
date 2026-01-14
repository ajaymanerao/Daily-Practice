2import java.util.*;
interface Client{
    void webdesign();
    void webdevelope();
}

abstract class RajTech implements Client{
    public void webdesign(){
        System.out.println("Green bg, top menu, three dot button");
    }
     
}
class RahulTech extends RajTech{         //If a class implements an interface but does not implement all of its methods, it must be declared abstract, or you will get a compiler error.
    public void webdevelope(){
        System.out.println("HTML, CSS, JS");

    }
}
public class MethodInterface {

    public static void main(String[] args) {
         Client c=new RahulTech();
    c.webdesign();
    c.webdevelope();
    }
    
}

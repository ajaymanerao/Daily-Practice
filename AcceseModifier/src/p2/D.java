package p2;
import p1.A;


public class D extends A{

 

void useAClass(){		
System.out.println("protected field  "+this.proc);
this.protectedFunction();
}

public static void main(String[] args) {
D d1=new D();
System.out.println("protected field  "+d1.proc);
d1.protectedFunction();
System.out.println("public field  "+d1.pub);
d1.publicFunction();
}
}
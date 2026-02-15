package p1;

public class C{


void f1(){
A a1=new A();
System.out.println("default fiels:"+a1.def);
a1.defaultFunction();
System.out.println("protected fiels:"+a1.pro);
a1.protectedFunction();
System.out.println("public  fiels:"+a1.pub);
a1.publicFunction();
}


}
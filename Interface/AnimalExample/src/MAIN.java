public class MAIN{



public static void main(String [] args){

Fish d=new Fish("dolly");
Cat c=new Cat("maau");
Animal a=new Fish();
Animal e=new Spider();
Pet p=new Cat();

System.out.println("---- Fish d ----");
System.out.println("Name: " + c.getName());
d.walk();
d.eat();
d.play();

System.out.println("---- Cat c ----");
System.out.println("Name: " + c.getName());
c.walk();
c.eat();
c.play();
 

System.out.println("---- Animal a (Fish) ----");
a.walk();
a.eat();

System.out.println("---- Animal e (Spider) ----");
e.walk();
e.eat();

System.out.println("---- Pet p (Cat) ----");
p.play();

}

}
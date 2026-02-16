public class MAIN{
public static void main(String [] args){


Animal [] animal=new Animal[2];
animal[0]=new Dog("Dog");
animal[1]=new Cat("Cat");

for(Animal a:animal){
System.out.println(a);
a.makeSound();
a.eat();
System.out.println("------------------------------------");
}
}
}
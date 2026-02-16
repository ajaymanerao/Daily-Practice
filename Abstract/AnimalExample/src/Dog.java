class Dog extends Animal{
public Dog(String name){
super(name);
}

void makeSound(){
System.out.println("Dog barks");
}

void eat(){
System.out.println("Dog eats meat");
}

public String toString(){
return super.toString();
}


}
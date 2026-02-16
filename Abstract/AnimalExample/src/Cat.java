class Cat extends Animal{
public Cat(String name){
super(name);
}

void makeSound(){
System.out.println("cat meows");
}

void eat(){
System.out.println("cat drinks milk");
}

public String toString(){
return super.toString();
}
}
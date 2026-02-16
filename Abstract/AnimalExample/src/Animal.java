abstract class Animal{
protected String name;

public Animal(String name){
this.name=name;
}

abstract void makeSound();
abstract void eat();

public String toString(){
return name;
}


}
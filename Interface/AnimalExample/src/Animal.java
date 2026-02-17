abstract class Animal{

protected int legs;

protected Animal(int legs){
this.legs=legs;
}

void walk(){
System.out.println("This animal walks on " + legs + " legs.");
}

abstract void eat();
}
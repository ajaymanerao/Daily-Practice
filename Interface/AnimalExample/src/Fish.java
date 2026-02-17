class Fish extends Animal implements Pet{
private String name;
public Fish(){
super(0);
}
public Fish(String name){
super(0);
this.name=name;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public void play(){
System.out.println("Fish plays in water.");
}

public void walk(){
System.out.println("Fish can't walk and has no legs.");
}

public void eat(){
System.out.println("Fish eats fish food.");
}



}
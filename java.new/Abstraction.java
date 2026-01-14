abstract class Animal{
    Animal(){
        System.out.println("Animal MAke Sound");
    }
    public abstract void sound();
    // {
    //     System.out.println("Animal MAke Sound");
    // }

}
class Dog extends Animal{
Dog(){
    super();
}
    
    public void sound(){
        System.out.println("Dog are Barking");

    }

}
class Lion extends Animal{
     public void sound(){
        System.out.println("Lion is Roar");

    }

}




public class Abstraction { 
    public static void main(String[] args) {
        Dog d= new Dog();
        Lion l=new Lion();
        d.sound();
        l.sound();
    }
}

package Interface;

class Animal{
    public void eat(){
        System.out.println("Animal it Somethimgs");

    }

}

class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat Mouse");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
    }
    
}

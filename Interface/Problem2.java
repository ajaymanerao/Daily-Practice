package Interface;

class Animal{
    Animal(){
        System.out.println("Animal does something");
    }

    public void leg(){
        System.out.println("Animal has leg");
    }
}

class Cat extends Animal{
    Cat(){
        System.out.println("Cat eat Mouse");
    }

    @Override
    public void leg(){
        System.out.println("Cat has 4 leg");
    }
}

public class Problem2 {
    public static void main(String[] args) {

       Animal a = new Cat();
       a.leg();

    }
}
package Design_class_obj;

class Person{
    private String name;
    private int age;


    Person(String InitialName){
        name=InitialName;
        age=0;
    }

    void printPerson(){
        System.out.println(name+" "+ age);
    }
    
    void growOlder(){
       age++;
    }

    int returnAge(){
        return age;
    }

    boolean isOfLengalAge(){
         return age >=18;

    }

    String getName(){
        return name;
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person p=new Person("Ajay");
        p.printPerson();
        p.growOlder();
        p.returnAge();
        p.isOfLengalAge();
        p.getName();

          System.out.println("Age: " + p.returnAge());
        System.out.println("Is legal age? " +  p.isOfLengalAge());



    }
    
}

class School{
void input1(){
    System.out.println("ABC");
}
}

class Student extends School{
      void input1(){
        System.out.println("Ajay");
      }
}


public class Oops {
    public static void main(String[] args) {
        School s=new School(); 
        Student s1=new Student();
        s.input1();
        s1.input1();
          
    }
    
}

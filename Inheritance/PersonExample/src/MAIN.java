public class MAIN{


public static void main(String [] args){
Person p=new Person("Ajay","Pune");
Student s1=new Student("Rahul","Pune","javaFull Stack", 2025, 47500.00);
Staff s2=new Staff("Amit","Mumbai","VM",47500.00); 
p.getPersonDetails();
s1.getStudentDetails();
s2.getStaffDetails();
}

}


/*
command

C:\Users\Ajay\Desktop\VM\Inheritance\PersonExample\src

javac MAIN.java

java MAIN

*/
package collections;
import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

         
        Student s1 = new Student("Ajay", 101, "ajay@gmail.com", "7620659878");
        Student s2 = new Student("Rahul", 102, "rahul@gmail.com", "1234567890");

        students.add(s1);
        students.add(s2);

        System.out.println("Students after adding:");
        for(Student s : students){
            System.out.println(s);
        }

        
        boolean check = students.contains(s1);
        System.out.println("\n Ajay present " + check);

         
        students.remove(s2);

        System.out.println("\nStudents after removing Rahul:");
        for(Student s : students){
            System.out.println(s);
        }
    }
}

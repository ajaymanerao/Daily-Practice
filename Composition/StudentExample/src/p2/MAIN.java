package p2;
import p1.*;
import java.time.LocalDate;

public class MAIN{
public static void main(String [] args){

Basic b1=new Basic(101,"Ajay", "Anerao", "Male", LocalDate.of(2003, 5, 28), 23); 
Contact c1=new Contact("ajayanerao7@gmail.com", "7620659878", "9579912924");
AcademicInfo a1=new AcademicInfo("111","Electronics & Telecommunication", 7, 75,"Sinhgad College Of Engineering Pune", "SPPU Univesity Pune", "2021", "2025");
Address a2= new Address("301", "Near to Human Mandhir Benal", "Tq. Loha, Dist. Nanded", "Maharashtra","India", 431708);
OtherInfo o1=new OtherInfo("AB+", "Indian", "General");
ParentInfo p1=new ParentInfo("Madhavrao", "Vice-Principal", "Jaishri", "HouseWife", 1200000.00);

Student s1=new Student(b1, c1, a1, a2, o1, p1);
System.out.println(s1);

}
}


/*
command

cd C:\Users\Ajay\Desktop\VM\Composition\StudentExample\src

 
javac -d ../bin p1\*.java p2\*.java

cd..

java -cp bin p2.MAIN



*/
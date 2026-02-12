package p1;
import java.time.LocalDate;

public class Basic{
private int id;
private String firstName;
private String lastName;
private String gender;
private LocalDate dateOfBirth;
private int age;

public Basic(int id, String firstName, String lastName, String gender, LocalDate dateOfBirth, int age){
this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.gender=gender;
this.dateOfBirth=dateOfBirth;
this.age=age;
}

public int getId(){return id;}
public String getFirstName(){return firstName;}
public String getLastName(){return lastName;}
public String getGender(){return gender;}
public LocalDate getDateOfBirth(){return dateOfBirth;} 
public int getAge(){return age;}
public void setId(int id){this.id=id;}
public void setFirstName(String fastName){this.firstName=firstName;}
public void setLastName(String lastName){this.lastName=lastName;}
public void setGender(String gender){this.gender=gender;}
public void setDateOfBirth(LocalDate dateOfBirth){this.dateOfBirth=dateOfBirth;} 
public void setAge(int age){this.age=age;}
}
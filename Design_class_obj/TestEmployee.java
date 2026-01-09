package Design_class_obj;

class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    int getID(){
        return id;
    }

    String getFirstName(){
        return firstName;
    }

    String getLastName(){
        return lastName;
    }

    String getName(){
        return firstName+" "+lastName;
    }

    int getSalary(){
        return salary;
    }

    void setSalary(int salary){
        this.salary=salary;
    }

    int getAnnualSalary(){
        return salary*12;
    }

    int raiseSalary(int percent){
        salary=salary+(salary*percent/100);
        return salary;

    }

    public String toString(){  //overriden must be public
        return "Employee [id="+id+", name="+getName()+", salary="+salary+"]";
    }

}

public class TestEmployee {

    public static void main(String[] args) {
        Employee e=new Employee(101, "Ajay", "Anerao", 500000);
         e.setSalary(550000); 
         System.out.println("Id: "+e.getID()); 
         System.out.println("FirstName: "+e.getFirstName());
         System.out.println("LastName: "+e.getLastName());
         System.out.println("FullNmae: "+e.getName());
         System.out.println("Salary: "+e.getSalary());
         System.out.println("AnnualSalary: "+e.getAnnualSalary());
         System.out.println("Salary after 30% hike: "+e.raiseSalary(30));
         System.out.println(e);

          

    }
    
}

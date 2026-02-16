public class MAIN{
public static void main(String [] args){

Employee [] employees= new Employee[2];

employees[0]=new FullTimeEmployee("Ajay", 500000);
employees[1]=new PartTimeEmployee("Rahul", 20, 500);

for(Employee e : employees){
System.out.println(e);
System.out.println("Salary : "+e.calculateSalary());
System.out.println("-------------------------------------------------");
}
}
}
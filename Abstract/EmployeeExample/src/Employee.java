abstract class Employee{
protected String name;


public Employee(String name){
this.name=name;
}

abstract double calculateSalary();

public String toString(){
return "Employee Name :"+name;
}
}
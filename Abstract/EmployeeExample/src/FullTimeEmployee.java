class FullTimeEmployee extends Employee{
private double monthlySalary;

public FullTimeEmployee(String name, double monthlySalary){
super(name);
this.monthlySalary=monthlySalary;
}

double calculateSalary(){
return monthlySalary;
}
}
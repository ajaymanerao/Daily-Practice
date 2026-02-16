class PartTimeEmployee extends Employee{
private int hours;
private double rate;

public PartTimeEmployee(String name, int hours, double rate){
super(name);
this.hours=hours;
this.rate=rate;
}

double calculateSalary(){
return hours*rate;
}
}
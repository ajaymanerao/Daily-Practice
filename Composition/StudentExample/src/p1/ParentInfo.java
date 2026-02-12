package p1;

public  class ParentInfo{
private String fatherName;
private String fatherOccupation;
private String motherName;
private String motherOccupation;
private double familyIncome;

public ParentInfo(String fatherName, String fatherOccupation, String motherName, String motherOccupation, double familyIncome){
this.fatherName=fatherName;
this.fatherOccupation=fatherOccupation;
this.motherName=motherName;
this.motherOccupation=motherOccupation;
this.familyIncome=familyIncome;
}

public String getFatherName(){return fatherName;}
public void setFatherName(String fatherName){this.fatherName=fatherName;}
public String getFatherOccupation(){return fatherOccupation;}
public void setFatherOccupation(String fatherOccupation){this.fatherOccupation=fatherOccupation;} 

public String getMotherName(){return motherName;}
public void setMotherName(String MotherName){this.fatherName=fatherName;}
public String getMotherOccupation(){return motherOccupation;}
public void setMotherOccupation(String motherOccupation){this.motherOccupation=motherOccupation;}
}
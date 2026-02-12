package p1;

public class AcademicInfo{
private String rollNumber;
private String branch;
private int semester;
private double percentage;
private String collegeName;
private String universityName;
private String startYear;
private String endYear;

public AcademicInfo(String rollNumber, String branch, int semester, double percentage, String collegeName, String universityName, String startYear, String endYear){
this.rollNumber=rollNumber;
this.branch=branch;
this.semester=semester;
this.percentage=percentage;
this.collegeName=collegeName;
this.universityName=universityName;
this.startYear=startYear;
this.endYear=endYear;
}

 
public String getRollNumber(){return rollNumber;}
public void setRollNumber(String rollNumber){this.rollNumber = rollNumber;}
public String getBranch(){return branch;}
public void setBranch(String branch){this.branch = branch;}
public int getSemester(){return semester;}

public void setSemester(int semester){
if(semester >=1 && semester <=8){
this.semester = semester;
}else{
System.out.println("Invalid Semester!");
}
}

public double getPercentage(){return percentage;}

public void setPercentage(double percentage){
if (percentage >= 0 && percentage <= 100) {
this.percentage = percentage;
} else{
System.out.println("Invalid percentage!");
}
}

public String getCollegeName(){return collegeName;}
public void setCollegeName(String collegeName){this.collegeName = collegeName;}
public String getUniversityName(){return universityName;}
public void setUniversityName(String universityName){this.universityName = universityName;}
public String getStartYear(){return startYear;}
public void setStartYear(String startYear){this.startYear = startYear;}
public String getEndYear(){return endYear;}
public void setEndYear(String endYear){this.endYear = endYear;}
}
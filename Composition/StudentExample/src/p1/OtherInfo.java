package p1;

public class OtherInfo{
private String bloodGroup;
private String nationality;
private String category;

public OtherInfo(String bloodGroup, String nationality, String category){
this.bloodGroup=bloodGroup;
this.nationality=nationality;
this.category=category;
}

public String getBloodGroup(){return bloodGroup;}
public void setBloodGroup(String bloodGroup){this.bloodGroup=bloodGroup;}
public String getNationality(){return nationality;}
public void setNationality(String nationality){this.nationality=nationality;}
public String getCategory(){return category;}
public void setCategory(String category){this.category=category;}
}
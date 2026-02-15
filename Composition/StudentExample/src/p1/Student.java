package p1;
public class Student{
private Basic basic;
private Contact contact;
private AcademicInfo academicInfo;
private Address address;
private OtherInfo otherInfo;
private ParentInfo parentInfo;
 

public Student(Basic basic, Contact contact, AcademicInfo academicInfo, Address address, OtherInfo otherInfo, ParentInfo parentInfo){
this.basic=basic;
this.contact=contact;
this.academicInfo=academicInfo;
this.address=address;
this.otherInfo=otherInfo;
this.parentInfo=parentInfo;
}


public String toString(){                                          
return 
       "Id :"+basic.getId()+"\n" +
       -"First Name : "+basic.getFirstName()+"\n" +
       "Last Name : "+basic.getLastName()+"\n" +
       "Gender : "+basic.getGender()+"\n" +
       "Date Of Birth : "+basic.getDateOfBirth()+"\n" +
       "Age : "+basic.getAge()+"\n" +
       "Email : "+contact.getEmail()+"\n" +
       "Phone Number : "+contact.getPhoneNumber()+"\n" +
       "Alternate Phone : "+contact.getAlternatePhone()+"\n" +
       "Roll Number : "+academicInfo.getRollNumber()+"\n" +
       "Branch : "+academicInfo.getBranch()+"\n" +
       "Semester : "+academicInfo.getSemester()+"\n" +
       "Percentage : "+academicInfo.getPercentage()+"%\n" +
       "College Name : "+academicInfo.getCollegeName()+"\n" +
       "University Name : "+academicInfo.getUniversityName()+"\n" +
       "Start Year : "+academicInfo.getStartYear()+"\n" +
       "End Year : "+academicInfo.getEndYear()+"\n" +
       "House No : "+address.getHouseNo()+"\n" +
       "Street : "+address.getStreet()+"\n" +
        "City : "+address.getCity()+"\n" +
        "State : "+address.getState()+"\n" +
        "Country : "+address.getCountry()+"\n" +
        "Pincode : "+address.getPinCode()+"\n" +
        "Blood Group : "+otherInfo.getBloodGroup()+"\n" +
        "Nationality : "+otherInfo.getNationality()+"\n" +
        "Category : "+otherInfo.getCategory()+"\n" +
        "Father Name : "+parentInfo.getFatherName()+"\n" +
        "Father Occupation : "+parentInfo.getFatherOccupation()+"\n" +
        "Mother Name : "+parentInfo.getMotherName()+"\n" +
        "Mother Occupation : "+parentInfo.getMotherOccupation();
}
}
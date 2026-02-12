package p1;

public class Contact{
private String email;
private String phoneNumber;
private String alternatePhone;

public Contact(String email, String phoneNumber, String alternatePhone){
this.email=email;
this.phoneNumber=phoneNumber;
this.alternatePhone=alternatePhone;
}

public String getEmail(){return email;}
public String getPhoneNumber(){return phoneNumber;}
public String getAlternatePhone(){return alternatePhone;}
public void setEmail(String email){this.email=email;}
public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
public void setAlternatePhone(String alternatePhone){this.alternatePhone=alternatePhone;}
}
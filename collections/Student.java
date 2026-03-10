package collections;
class Student {
    String name;
    int rollNumber;
    String email;
    String phoneNumber;

     
    Student(String name, int rollNumber, String email, String phoneNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

   
    public String toString() {
        return "Name: " + name +
               ", Roll Number: " + rollNumber +
               ", Email: " + email +
               ", Phone: " + phoneNumber;
    }
}

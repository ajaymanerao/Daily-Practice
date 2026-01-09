package Design_class_obj;

class Author{
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        gender=Character.toLowerCase(gender);
        if(gender=='m' || gender=='f'){
            this.gender=gender;
        }else{
            this.gender='u';
        }
         
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;

    }

    void setEmail(String email){
        this.email=email;
    }

    char getGender(){
        return gender;
    }

    void print(){
        System.out.println(name + " (" + gender + ") at " + email);
    }

}

public class TestAuthor {
    public static void main(String[] args) {
        Author A= new Author("Balaji", "balaji@gmail.com", 'm');
        System.out.println("Name "+A.getName());
        System.out.println("Email "+A.getEmail());
        System.out.println("Gender "+A.getGender());
        System.out.println("-------------------");
        A.print();

        
    }
}

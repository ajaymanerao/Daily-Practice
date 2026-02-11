package Practice;

public class StringCase {
    public static void main(String[] args) {
        String s1="java";
        String s2=s1;
        s1="Python";
        String s3="java";

        System.out.println(s1);
        System.out.println(s2);
        String s4=new String("Ajay");
        String s5=new String("Ajay");
       System.out.println("Does s1 equal s3? " + s1.equals(s3)); // false ("Python" vs "java")}

       System.out.println("Does s4 equal s5? " + s4.equals(s5)); // true (Content is same)
        System.out.println("Is s4 the same object as s5? " + (s4 == s5)); // false (Different heap objects)
         
    }
    
}

package collections;
import java.util.*;

public class ArraysList {
    public static void main(String[] args) {

        ArrayList<String>family=new ArrayList<String>();
        family.add("Kalpesh");
        System.out.println(family.add("Kalpesh"));
        family.add("Navin");
        family.add("sneha");
        family.add("Anup");

        System.out.println(family.contains("Kalpesh"));
        System.out.println(family);
        family.remove("Kalpesh");
        System.out.println(family);
        System.out.println("E remove(index) "+family.remove(0));
        System.out.println(family);

        






    }
    
}

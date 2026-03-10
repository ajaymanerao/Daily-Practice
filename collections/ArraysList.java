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


        ArrayList<String>family1=new ArrayList<String>();
        family1.add("Raju");
        family1.add("Kareeena");
        family1.add("Shaeukh");
        family.add("Ravi");

        family.addAll(family1);
        System.out.println(family);


        System.out.println("Contains All "+family.containsAll(family));
        family.remove(family1); 
        System.out.println(family);

        Object[] arr=family.toArray();

        for(Object ob : arr){
            System.out.println(ob);
             
        }
        System.out.println("------------------------------");

        String names[]=new String[family.size()];

        names=family.toArray(names);
        for(String name:names){
            System.out.println(name);
        }

        Iterator<String> itr=family.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }

        






    }
    
}

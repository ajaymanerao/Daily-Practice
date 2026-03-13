package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        ArrayList<String> actress =new ArrayList<>();
        actress.add("Sharddha");
        actress.add("Rashmika");
        actress.add("Janvi");
        actress.add("Sai Pallvi");
        actress.add("Kriti Suresh");

        System.out.println(actress);
        String input ="Janvi";
        Iterator<String> itr=actress.iterator();

        while(itr.hasNext()){
            String str=itr.next();
            if(str.equals(input)){
                //actress.remove(str); //ConcurrentModificationException
                itr.remove();
            }

        }
        System.out.println(actress);

           


    }
}

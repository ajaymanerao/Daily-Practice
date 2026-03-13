package collections;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
    LinkedList<String>movie=new LinkedList<String>();
    movie.offer("Sholey");
    movie.offer("KGF");
    movie.offer("RRR");
    movie.offer("Toxic");
    movie.offer("Pushpa");


    System.out.println(movie);

    movie.removeFirst();
    System.out.println(movie);

    movie.removeLast();
    System.out.println(movie);

    movie.offerFirst("Sairat");
    System.out.println(movie);

    movie.offerLast("Fandry");
    System.out.println(movie);

    movie.add(3, "Raja HinduStani");
    System.out.println(movie);
    
}
}

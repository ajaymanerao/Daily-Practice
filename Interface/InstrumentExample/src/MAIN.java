public class MAIN{

public static void tune(Instrument i){
i.play();
System.out.println(i.what());
i.adjust();
System.out.println("--------------------------------------");
}

public static void main(String [] args){
tune(new Wind());
tune(new Percussion());
tune(new Stringed());
tune(new Woodwind());
tune(new Brass());
}
}
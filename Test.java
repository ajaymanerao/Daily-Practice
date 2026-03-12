import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws Exception {

        System.out.println("Before redirect");

        PrintStream file = new PrintStream("file.txt");

        System.setOut(file);

        System.out.println("Hello Java");
    }
}
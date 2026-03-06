package multiple;

class A implements Runnable {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i * 5);
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        A r1 = new A();
        Thread t1 = new Thread(r1);   
        t1.start();
    }
}
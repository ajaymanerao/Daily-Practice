class Counter{
    int cnt=0;
    public void increment(){
        cnt++;
    }
}


class Thread1 extends Thread{
    Counter counter;
    public Thread1(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<=100;i++){
            counter.increment();
        }
    }
}

class Thread2 extends Thread{
    Counter counter;
    public Thread2(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<=100;i++){
            counter.increment();
        }
    }
}

class Thread3 extends Thread{
    Counter counter;
    public Thread3(Counter counter){
        this.counter=counter;
    }

    public void run(){
        for(int i=0;i<=100;i++){
            counter.increment();
        }
    }
}

public class Example2 {
    public static void main(String[] args) {
        
    
    Counter c=new Counter();
    Thread1 t1=new Thread1(c);
    Thread2 t2=new Thread2(c);
    Thread3 t3=new Thread3(c);
    t1.start();
    t2.start();
    t3.start();
    //Thread.sleep(300);
    System.out.println(c.cnt);
    }
    
}

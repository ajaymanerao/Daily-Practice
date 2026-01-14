//By extending thread class

// class A extends Thread{
//     public void run(){
//         for(int i=1; i<=5; i++){
//             try{
//             System.out.println("Ajay");
//             Thread.sleep(2000);
//             }
//             catch(InterruptedException a){

//             }
//         }

//     }

// }



//By implementing runnable interface

// class A implements Runnable{
//     public void run(){
//         for(int i=1;i<=5;i++){
//             System.out.println("Ajay");
//         }
//     }
// }


// class A extends Thread{
//     public void run(){
         
//             String n=Thread.currentThread().getName(); //use the name below declare 
//             for(int i=1; i<=3;i++){
//                 System.out.println(n);
//         }

//     }
// }


// class A extends Thread{
//     public void run(){
         
//             String n=Thread.currentThread().getName(); //use the name below declare 
//             try{
//             for(int i=1; i<=3;i++){
//                 System.out.println(n);
//                 Thread.sleep(4000);
//             }
//         }
//             catch(InterruptedException i){

//             }
        

    
// }
// }


// public class Multithreading {
    // public static void main(String[] args) {
    //     A t= new A();
    //     t.start();
    //     for(int i=1; i<=5; i++){
    //         try{
    //         System.out.println("Aniket");
    //         Thread.sleep(2000);
    //         }
    //         catch(InterruptedException b){

    //         }
    //     }



    //By IRI

    // A r=new A();
    // Thread t=new Thread(r);
    // t.start();



    // A t1= new A();
    // A t2= new A();
    // A t3= new A();

    // t1.setName("Thread 1");
    // t2.setName("Thread 2");
    // t3.setName("Thread 3");

     
    // t2.start();
    // try {
    //     t2.join();
    // } catch (InterruptedException e) {
    //     // TODO: handle exception
    // }
    // t1.start();
    // t2.start();;
    // t2.stop();
    // t3.start();

    // String n=Thread.currentThread().getName(); //use the name below declare 
    //         for(int i=1; i<=3;i++){
    //             System.out.println(n);
    //     }


//     class A extends Thread {
//         public void run(){
//             String name=Thread.currentThread().getName();
//             for(int i=1;i<=3;i++){
//                 System.out.println(name);
//             }


//         }
    
//     }   
    
// public class Multithreading {

    

//        public static void main(String [] args){
//         A t1= new A();
//         A t2= new A();
//         A t3= new A();

//         t1.start();
//         t1.stop();
//         t2.start();
        
//         t3.start();

//         t1.setName("Aj");
//         t2.setName("Aniket");
//         t3.setName("Vishal");

// class Bus implements Runnable {
//     int available=2,passenger;     //available 2 means seat available 2
//     Bus(int passenger){
//         this.passenger=passenger;
//     }
//     public synchronized void run(){
// String name=Thread.currentThread().getName();
// if(available >= passenger){
//     System.out.println(name+" Reversed Seat");
//     available=available-passenger;
// }else{
//     System.out.println("sorry seat is not reversed");
// }

//     }

    
// }


// public class Multithreading {
    
//  public static void main(String [] args){

//     Bus b=new Bus(1);  //1=number of passener per seat
//     Thread t1= new Thread(b);
//      Thread t2= new Thread(b);
//       Thread t3= new Thread(b);


//       t1.setName("Ajay");
//       t2.setName("Ram");
//       t3.setName("Sham");

//       t1.start();
//       t2.start();
//       t3.start();




class Table{
    public synchronized void PrintTable(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n*i);
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(5);

    }

}

class Thread2 extends Thread{
    Table t;
    Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.PrintTable(7);
    }

}



public class Multithreading {
public static void main(String[] args) {


    Table T= new Table();

    Thread1 A1= new Thread1(T);
    Thread2 A2 =new Thread2(T);

    A1.start();
    A2.start();
    




    }
    
}

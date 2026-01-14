public class ExcertionHandling {
    // public static void main(String[] args) {

        //Arithmatic Exception

        // int a=10, b=0,c;
        // try{
        // c=a/b;
        // System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println(e);


        // }


        //NullPointerException

        // String str=null;
        // try{
        // System.out.println(str.toUpperCase());
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }


        //NumberFormatException

        // String str="ajay";
        // try{
        //     int a=Integer.parseInt(str);
        //     System.out.println(str);

        // }catch(Exception e){
        //     System.out.println("String can't be converted to Integer");
        // }
        // System.out.println("main metod excuted");


        //Nested Try block

        // try {

        //     try {
        //         int arr[]={10,20,30,40};
        //         System.out.println(arr[2]);
        //     } catch (ArrayIndexOutOfBoundsException a) {
        //         System.out.println("Array index out of Bound");
                
        //     }

        //     //varcha code excute karaycha hota manun khali lihil aahe karan 1st line la exception aal tar nested try block excute hot nahi

        //     int a=10, b=0,c;
        //     c=a/b;
        //     System.out.println(c);
            
        // } catch (ArithmeticException b) {
        //     System.out.println("can not divide by zero");
            
        // }
        // System.out.println("Learn Coding");


        //Nested Catch Block

        // try {
        //     int a=10,b=0,c;
        //     c=a/b;
        //     System.out.println(c);


        // } catch (ArithmeticException a) {
        //      System.out.println("Arithmemtic Exception Occur");

        //      try {
        //         int arr[]= {10,20,30};
        //         System.out.println(arr[5]);
        //      } catch (Exception e) {
        //          System.out.println("Array index out of index");
        //      }
        // }


        // int age =18;
        // if(age>15){
        //     throw new ArithmeticException("You can not vote");
                          
        // }else{
        //     System.out.println("you can vote");
        // }


        //throws keyword 
        // public static void main(String [] args) throws InterruptedException{

        //     for(int i=1; i<=10; i++){
        //         System.out.println(i);
        //         Thread.sleep(2000);
        //     }
        // }

    }
    
 }

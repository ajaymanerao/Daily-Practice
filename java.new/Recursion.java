public class Recursion {
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;


    //     }
    //  System.out.println(n+" ");
    //  printDec(n-1);


    // }


    public static void printInc(int n){
        int m=10;

        if(n==m){
            System.out.println(n);
            return;

        }
        System.out.println(n);
        printInc(n+1);
        
    }

    public static int  calFact(int n){
        
        if(n==0){
            return 1;
        }
        // int fnm1=calFact(n-1);
         int fn=n*calFact(n-1);

         return fn;



    }


    public static int calFac(int n){
        if(n==0){
            return 1;
        }
        int fn=n*calFac(n-1);
        return fn;
    }
  

    public static int printSum(int n){

        if(n==1){
            return 1;
        }

        int sum=n+printSum(n-1);
        return sum;

    }


    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+ fnm2;
        return fn;

    }



    public static void Pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int n=10;
        // printDec(n);
        //int n=1;
        //printInc(n);
        //int n=25;
        //System.out.println(calFact(n));
        //System.out.println(calFac(n));
        //System.out.println(printSum(n));
       // System.out.println(fib(n));
       int n=5;
       Pattern(n);

         
         
    }
}

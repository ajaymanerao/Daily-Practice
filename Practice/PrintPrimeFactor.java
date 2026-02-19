package Practice;

public class PrintPrimeFactor {
    public static void printPrimeFactor(int num){
        for(int i=1;i<=num;i++){
        if(num%i==0){
        int count =0;
        for(int j=1;j<=i;j++){
         
        if(i%j==0){
        count++;
        }
    }

        if(count ==2){
            System.out.print(i+" ");
        }
    }
    }
    

    }



    public static void main(String[] args) {
       int num=12;
       printPrimeFactor(num); 
    }
    
}

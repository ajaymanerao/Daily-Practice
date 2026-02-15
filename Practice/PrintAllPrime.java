package Practice;

import java.util.Scanner;

public class PrintAllPrime {
public static void printAllPrime(int num){
     
    for(int i=1;i<=num;i++){
        int count =0;
        for(int j=1;j<=num;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count ==2){
            System.out.print(i+" ");
        }
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        printAllPrime(num);


    }
    
}

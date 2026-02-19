package Practice;

import java.util.Scanner;

public class SumOfAllPrime {
    public static void sumOfAllPrime(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
    int count=0;
    for(int j=1;j<=n;j++){
        if(i%j==0){
            count++;
        }
    }
    if(count==2){
       sum +=i;
    }
    }
    System.out.println("Sum of All prime number is :"+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sumOfAllPrime(num);

    }
}

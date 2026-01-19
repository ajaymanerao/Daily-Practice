package Array;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        size=sc.nextInt();

        int arr[]=new int[size];
        //arr is a 1-D Array which has size(5) elements are of type int


        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Element");
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
    
}

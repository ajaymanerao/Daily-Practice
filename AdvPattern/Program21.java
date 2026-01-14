//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *


package AdvPattern;

public class Program21 {

    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*N)-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        P1(5);
        
    }
    
}

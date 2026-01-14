//     1
//    22
//   333
//  4444
// 55555
//  4444
//   333
//    22
//     1

package AdvPattern;

public class Program22 {

      public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*N)-i;j++){
                    System.out.print(2*N-i);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1(5);
        
    }
    
}

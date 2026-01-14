//     1
//    21
//   321
//  4321
// 54321
//  4321
//   321
//    21
//     1

package AdvPattern;

public class Program29 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=i;j>=1;j--){
                     System.out.print(j);
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=2*N-i;j>=1;j--){
                     System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1(5);
        
    }
    
}

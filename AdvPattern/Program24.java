//     5
//    45
//   345
//  2345
// 12345
//  2345
//   345
//    45
//     5
    
package AdvPattern;

public class Program24 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=N-i+1;j<=N;j++){
                    System.out.print(j);
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=i-N+1;j<=N;j++){
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

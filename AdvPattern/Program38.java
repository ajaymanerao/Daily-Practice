// 54321
//  5432
//   543
//    54
//     5
//    54
//   543
//  5432
// 54321

package AdvPattern;

public class Program38 {
      public static void P1(int N){

        for(int i=1;i<2*N;i++){
            if(i<=N){
                 for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=N;j>=i;j--){
                    System.out.print(j);
                }
            }else{
                for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i-N+1;j++){

                    System.out.print(N-j+1);
                }
             }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1(5);
        
}
}

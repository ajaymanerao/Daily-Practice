// 55555
//  4444
//   333
//    22
//     1
//    22
//   333
//  4444
// 55555

package AdvPattern;

public class Program34 {

     public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=N;j>=i;j--){
                    System.out.print(N+1-i);
                }
            }else{
                 for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=(i-N)+1;j++){
                    System.out.print(i-N+1);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }

    
}

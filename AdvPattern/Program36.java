// 54321
//  4321
//   321
//    21
//     1
//    21
//   321
//  4321
// 54321


package AdvPattern;

public class Program36 {
    public static void P1(int N){
         for(int i=1;i<2*N;i++){
            if(i<=N){
                for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=(N+1-i);j>=1;j--){
                    System.out.print(j);

                }
                //System.out.println();
            }else{
                for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=i-N+1;j>=1;j--){
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

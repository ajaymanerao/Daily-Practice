//     A
//    bA
//   CbA
//  dCbA
// EdCbA
//  dCbA
//   CbA
//    bA
//     A

package AdvPattern;

public class Program28 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=i;j>=1;j--){
                    if(j%2!=0){
                        System.out.print((char)(64+(j)));
                    }else{
                        System.out.print((char)(96+j));
                    }
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=2*N-i;j>=1;j--){
                     if(j%2!=0){
                        System.out.print((char)(64+(j)));
                    }else{
                        System.out.print((char)(96+j));
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        P1(5);
        
    }
    
    
}

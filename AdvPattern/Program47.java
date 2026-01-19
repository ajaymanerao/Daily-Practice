//    1
//    222
//   33333
//  4444444
// 555555555
// 111111111
//  2222222
//   33333
//    444
//     5

package AdvPattern;

public class Program47 {
     public static void P1(int N){
        for(int i=1;i<=2*N;i++){
            if(i<=N){
                for(int j=N;j>i;j--){
                    System.out.print(" ");
                }
                
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print(i);
                }
            }else{
                for(int j=1;j<i-N;j++){
                    System.out.print(" ");
                }
                int val=(2*N+1)-i;
                for(int j=2*val-1;j>=1;j--){
                    System.out.print(i-N);
                    
                }

            }
            System.out.println();
             
        }

    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}

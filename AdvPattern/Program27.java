//     A
//    Ab
//   AbC
//  AbCd
// AbCdE
//  AbCd
//   AbC
//    Ab
//     A

package AdvPattern;

public class Program27 {

    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                //Print Spaces
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=i;j++){
                    if(j%2==0){
                        System.out.print((char)(96+(j)));
                    }else{
                        System.out.print((char)(64+j));
                    }
                    
                 
                }
            }else{
                  for (int j = 1; j <=i-N; j++) {
                    System.out.print(" ");
                }

                for(int j=1;j<=(2*N)-i;j++){
                    if(j%2==0){
                        System.out.print((char)(96+(j)));
                    }else{
                        System.out.print((char)(64+j));
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

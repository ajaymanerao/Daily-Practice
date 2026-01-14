// AbCdE
//  bCdE
//   CdE
//    dE
//     E
//    dE
//   CdE
//  bCdE
// AbCdE

package AdvPattern;

public class Program45 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for (int j = 1; j<=i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=i;j<=N;j++){
                     if(j%2==0){
                        System.out.print((char)(96+j));
                    }else{
                        System.out.print((char)(64+j));
                    }
                     
                }
            }else{
                for (int j = 1; j <=2*N-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=(2*N)-i;j<=N;j++){
                   if(j%2==0){
                        System.out.print((char)(96+j));
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

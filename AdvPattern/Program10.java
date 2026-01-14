// E
// dE
// CdE
// bCdE
// AbCdE
// bCbE
// CcE
// dE
// E

package AdvPattern;

public class Program10 {
    public static void P1(int N){
        for(int i=N;i>=1;i--){
            for(int j=i;j<=N;j++){
                if(j%2!=0){
                    System.out.print((char)(64+j));
                }else{
                    System.out.print((char)(96+j));
                }
            }
            System.out.println();
            
        }

        for(int i=2;i<=N;i++){
            for(int j=i;j<=N;j++){
                if(j%2!=0){
                    System.out.print((char)(64+j));
                }else{
                    System.out.print((char)(96+i));
                }
            }
            System.out.println();
        }
    }
    



    public static void main(String[] args) {
        P1(5);
        
    }
    
}

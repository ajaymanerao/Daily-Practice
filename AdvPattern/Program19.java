// EdCbA
// EdCb
// EdC
// Ed
// E
// Ed
// EdC
// EdCb
// EdCbA

package AdvPattern;

public class Program19 {
    public static void P1(int N){

        for(int i=1;i<2*N;i++){
            if(i<=N){
                for(int j=N;j>=i;j--){
                    if(j%2==0){
                         System.out.print((char)(96+j));
                    }else{
                        System.out.print((char)(64+j));
                    }
                     
                }
            }else{
                for(int j=1;j<=i-N+1;j++){
                    if(j%2==0){
                         System.out.print((char)(96+(N-j+1)));
                    }else{
                        System.out.print((char)(64+(N-j+1)));
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

// AbCdE
// AbCd
// AbC
// Ab
// A
// Ab
// AbC
// AbCd
// AbCdE


package AdvPattern;

public class Program18 {
     public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for(int j=1;j<=N-i+1;j++){
                    if(j%2==0){
                        System.out.print((char)(96+j));
                    }else{
                        System.out.print((char)(64+j));

                    }
                     
                }
                
            }else{
                for(int j=1;j<=(i-N)+1;j++){
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

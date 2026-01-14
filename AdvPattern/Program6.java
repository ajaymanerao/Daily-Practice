// A
// bb
// CCC
// dddd
// EEEEE
// dddd
// CCC
// bb
// A

package AdvPattern;

public class Program6 {

    public static void P1(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            if(i%2!=0){
                 System.out.print((char)(64+i));
            }else{
                 System.out.print((char)(96+i));

            }
             
            
        }
        System.out.println();
    }
     for(int i=N-1;i>=1;i--){
        for(int j=1;j<=i;j++){
             if(i%2!=0){
                 System.out.print((char)(64+i));
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

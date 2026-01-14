// *****
// ****
// ***
// **
// *
// **
// ***
// ****
// *****

package AdvPattern;

public class Program11 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for(int j=1;j<=(N+1-i);j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=(i-N)+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        P1(5);
    }
    
}

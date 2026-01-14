// 12345
// 1234
// 123
// 12
// 1
// 12
// 123
// 1234
// 12345

package AdvPattern;

public class Program14 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for(int j=1;j<=N-i+1;j++){
                    System.out.print(j);
                }
                
            }else{
                for(int j=1;j<=(i-N)+1;j++){
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

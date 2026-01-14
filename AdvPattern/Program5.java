// 5
// 54
// 543
// 5432
// 54321
// 5432
// 543
// 54
// 5
package AdvPattern;

public class Program5 {

    public static void P1(int N){
    for(int i=1;i<=2*N-1;i++){
        if(i<=N){
            for(int j=N;j>N-i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
            else{
                for(int j=N;j>i-N;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
    
        }
    }  

    


    public static void main(String[] args) {
        P1(5);
        
    }
    
}

// 1
// 21
// 321
// 4321
// 54321
// 4321
// 321
// 21
// 1

package AdvPattern;

public class Program2 {

    public static void P1(int N){
        for(int i=1;i<=N;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            System.out.println();
        }

          for(int i=N-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        P1(5);
        
    }
    
}

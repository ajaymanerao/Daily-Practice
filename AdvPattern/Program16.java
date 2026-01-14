// 12345
// 2345
// 345
// 45
// 5
// 45
// 345
// 2345
// 12345

package AdvPattern;

public class Program16 {
    public static void P1(int N){
        for(int i=1;i<2*N;i++){
            if(i<=N){
                for(int j=i;j<=N;j++){
                    System.out.print(j);
                }
            }else{
                for(int j=(2*N)-i;j<=N;j++){
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

// 5
// 45
// 345
// 2345
// 12345
// 2345
// 345
// 45
// 5
package AdvPattern;

public class Program4 {
    public static void P1(int N){
    for(int i=N;i>=1;i--){
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();
    }
     for(int i=2;i<=N;i++){
        for(int j=i;j<=N;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}



    public static void main(String[] args) {
        P1(5);
        
    }
    
}

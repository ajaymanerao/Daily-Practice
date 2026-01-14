// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1

package AdvPattern;

public class Program3 {
    public static void P1(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
     for(int i=N-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

    
    public static void main(String[] args) {
        P1(5);
        
    }
}
